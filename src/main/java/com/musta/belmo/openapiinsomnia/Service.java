package com.musta.belmo.openapiinsomnia;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.musta.belmo.openapiinsomnia.insomnia.Authentication;
import com.musta.belmo.openapiinsomnia.insomnia.Body;
import com.musta.belmo.openapiinsomnia.insomnia.ExportedInsomniaWorkSpace;
import com.musta.belmo.openapiinsomnia.insomnia.Header;
import com.musta.belmo.openapiinsomnia.insomnia.Resource;
import com.musta.belmo.openapiinsomnia.open.RouteDescriber;
import com.musta.belmo.openapiinsomnia.open.RoutesService;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Service {
	public static final String WORKSPACE_PREFIX = "wrk_";
	public static final String FOLDER_PREFIX = "fld_";
	public static final String REQUEST_PREFIX = "req_";
	public static final String PAIR_PREFIX = "pair_";
	
	static void createInsomniaImportFile(String jsonFile, String outputFile) throws IOException {
		final List<RouteDescriber> list = RoutesService.readRoutesDescribers(jsonFile);
		
		final ExportedInsomniaWorkSpace exportedInsomniaWorkSpace = new ExportedInsomniaWorkSpace();
		exportedInsomniaWorkSpace.setExportFormat(4);
		final String workSpaceId = WORKSPACE_PREFIX + getRandomHexString32();
		final Resource workSpace = createWorkSpace(workSpaceId);
		final Resource environment = createEnvironment(workSpaceId, false);
		final Resource subEnvironment = createEnvironment(environment.getId(), true);
		final List<Resource> mResources = convertRouteDescriberToRequests(list, workSpaceId);
		final List<Resource> completeResources = groupInFolders(workSpaceId, mResources);
		
		completeResources.add(workSpace);
		completeResources.add(environment);
		completeResources.add(subEnvironment);
		exportedInsomniaWorkSpace.setResources(completeResources);
		writeToFile(outputFile, exportedInsomniaWorkSpace);
	}
	
	private static void writeToFile(String outputFile, ExportedInsomniaWorkSpace exportedInsomniaWorkSpace) throws IOException {
		StringWriter stringWriter = new StringWriter();
		final ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.writeValue(stringWriter, exportedInsomniaWorkSpace);
		FileUtils.write(new File(outputFile), stringWriter.toString(), "UTF-8");
	}
	
	private static Resource createEnvironment(String parent, boolean isChild) {
		Resource environment = new Resource();
		environment.setId("env_" + getRandomHexString32());
		environment.setParentId(parent);
		if (isChild) {
			environment.setName("ENV01");
			environment.setColor("#f03000");
			
		} else {
			environment.setName("Base Environment");
		}
		
		final Map<String, String> map = createEnvironmentData();
		environment.setData(map);
		environment.setType("environment");
		return environment;
	}
	
	
	private static Map<String, String> createEnvironmentData() {
		HashMap<String, String> map = new HashMap<>();
		map.put("base_url", "MY_BASE_URL --replace this");
		return map;
	}
	
	private static List<Resource> groupInFolders(String parent, List<Resource> mResources) {
		final Map<String, List<Resource>> map = mResources.stream()
				.filter(res -> res.getFolder() != null)
				.sorted(Comparator.comparing(Resource::getFolder))
				.collect(Collectors.groupingBy(Resource::getFolder));
		final List<Resource> finalResource = new ArrayList<>();
		final int[] y = {0};
		map.forEach((folder, resource) -> {
					Resource mFolder = new Resource();
					String idFolder = FOLDER_PREFIX + getRandomHexString32();
					mFolder.setId(idFolder);
					mFolder.setParentId(parent); // all folders belong to the parent workSpace
					mFolder.setName(folder);
					mFolder.setMetaSortKey(159844003877L + y[0]++);
					mFolder.setType("request_group");
					finalResource.add(mFolder);
					int i = 0;
					for (Resource child : resource) {
						child.setParentId(idFolder);
						child.setMetaSortKey(159849003877L + i++);
					}
					finalResource.addAll(resource);
				}
		);
		return finalResource;
	}
	
	private static List<Resource> convertRouteDescriberToRequests(List<RouteDescriber> describers, String parent) {
		final List<Resource> mResources = new ArrayList<>();
		int i = 0;
		for (RouteDescriber routeDescriber : describers) {
			Resource resource = new Resource();
			String mUrl = routeDescriber.getPaths().get(0);
			resource.setId(REQUEST_PREFIX + getRandomHexString32());
			if (!routeDescriber.getMethods().isEmpty()) {
				resource.setMethod(routeDescriber.getMethods().get(0));
			} else {
				resource.setMethod("GET");
			}
			resource.setParentId(parent);
			resource.setName(createName(mUrl, resource.getMethod()));
			String folder = createFolderName(mUrl);
			resource.setFolder(folder);
			resource.setUrl("{{ base_url }}" + mUrl);
			resource.setSettingEncodeUrl(true);
			resource.setSettingRebuildPath(true);
			resource.setSettingSendCookies(true);
			resource.setSettingStoreCookies(true);
			resource.setSettingDisableRenderRequestBody(true);
			resource.setType("request");
			resource.setAuthentication(new Authentication());
			resource.setHeaders(Collections.singletonList(getHeader()));
			resource.setBody(new Body());
			resource.setDescription(String.format("%s %s", resource.getMethod(), resource.getUrl()));
			resource.setParameters(new ArrayList<>());
			
			mResources.add(resource);
		}
		return mResources;
	}
	
	private static Resource createWorkSpace(String parent) {
		Resource woSpace = new Resource();
		woSpace.setId(parent);
		woSpace.setType("workspace");
		woSpace.setName("NEW");
		return woSpace;
	}
	
	private static String createName(String mUrl, String method) { // refactor this
		String name = mUrl.substring(1).replace('/', '-');
		String adverb = "by";
		if (!method.equals("GET")) {
			adverb = "with";
		}
		name = name.replaceAll("(\\{\\w+})", adverb + " $0");
		name = String.format("[%s] %s", method, name);
		name = name.replaceAll("-$", "");
		name = name.replaceAll("-", " ");
		
		return name;
	}
	
	private static String createFolderName(String mUrl) {
		if (mUrl == null || mUrl.isEmpty())
			return "";
		final StringBuilder sb = new StringBuilder();
		final String substring = mUrl.substring(1);
		for (int i = 0; i < substring.length(); i++) {
			char c = substring.charAt(i);
			if (c != '/') {
				sb.append(c);
			} else {
				break;
			}
		}
		return sb.toString();
	}
	
	private static Header getHeader() {
		Header header = new Header();
		header.setName("Content-Type");
		header.setValue("application/json");
		header.setId(PAIR_PREFIX + getRandomHexString32());
		return header;
	}
	
	private static String getRandomHexString(int numchars) {
		Random r = new Random();
		final StringBuilder sb = new StringBuilder();
		while (sb.length() < numchars) {
			sb.append(Integer.toHexString(r.nextInt()));
		}
		return sb.toString().substring(0, numchars);
	}
	
	private static String getRandomHexString32() {
		return getRandomHexString(32);
	}
}
