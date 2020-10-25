package com.musta.belmo.openapiinsomnia.insomnia.adapter;

import com.musta.belmo.openapiinsomnia.Util;
import com.musta.belmo.openapiinsomnia.insomnia.creators.EnvironmentCreator;
import com.musta.belmo.openapiinsomnia.insomnia.objects.ExportedInsomniaWorkSpace;
import com.musta.belmo.openapiinsomnia.insomnia.creators.RequestCreator;
import com.musta.belmo.openapiinsomnia.insomnia.objects.Resource;
import com.musta.belmo.openapiinsomnia.insomnia.creators.WorkspaceCreator;
import com.musta.belmo.openapiinsomnia.routes.objects.RouteDescriber;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Adapter {
	
	public static final String WORKSPACE_PREFIX = "wrk_";
	public static final String FOLDER_PREFIX = "fld_";
	
	public static ExportedInsomniaWorkSpace adaptToInsomniaWorkspace(List<RouteDescriber> describers) {
		final String workSpaceId = WORKSPACE_PREFIX + Util.getRandomHexString32();
		final List<Resource> mResources = RequestCreator.convertRouteDescriberToRequests(describers, workSpaceId);
		
		final ExportedInsomniaWorkSpace exportedInsomniaWorkSpace = new ExportedInsomniaWorkSpace();
		exportedInsomniaWorkSpace.setExportFormat(4);
		final Resource workSpace = WorkspaceCreator.createWorkSpace(workSpaceId);
		final Resource environment = EnvironmentCreator.createEnvironment(workSpaceId, false);
		final Resource subEnvironment = EnvironmentCreator.createEnvironment(environment.getId(), true);
		final List<Resource> completeResources = groupInFolders(workSpaceId, mResources);
		
		completeResources.add(workSpace);
		completeResources.add(environment);
		completeResources.add(subEnvironment);
		exportedInsomniaWorkSpace.setResources(completeResources);
		return exportedInsomniaWorkSpace;
	}
	
	private static List<Resource> groupInFolders(String parent, List<Resource> mResources) {
		final Map<String, List<Resource>> map = mResources.stream()
				.filter(res -> res.getFolder() != null)
				.sorted(Comparator.comparing(Resource::getFolder))
				.collect(Collectors.groupingBy(Resource::getFolder));
		
		final List<Resource> finalResource = new ArrayList<>();
		map.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByKey())
				.forEach(entry -> {
					final String folder = entry.getKey();
					final List<Resource> resource = entry.getValue();
					final Resource mFolder = new Resource();
					final String idFolder = FOLDER_PREFIX + Util.getRandomHexString32();
					mFolder.setId(idFolder);
					mFolder.setParentId(parent); // all folders belong to the parent workSpace
					mFolder.setName(folder);
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
	
}
