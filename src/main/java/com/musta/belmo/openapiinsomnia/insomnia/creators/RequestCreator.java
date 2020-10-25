package com.musta.belmo.openapiinsomnia.insomnia.creators;

import com.musta.belmo.openapiinsomnia.Util;
import com.musta.belmo.openapiinsomnia.insomnia.objects.Authentication;
import com.musta.belmo.openapiinsomnia.insomnia.objects.Body;
import com.musta.belmo.openapiinsomnia.insomnia.objects.Resource;
import com.musta.belmo.openapiinsomnia.routes.objects.RouteDescriber;

import java.util.ArrayList;
import java.util.List;

public class RequestCreator {
	public static final String REQUEST_PREFIX = "req_";
	
	public static List<Resource> convertRouteDescriberToRequests(List<RouteDescriber> describers, String parent) {
		final List<Resource> mResources = new ArrayList<>();
		
		for (RouteDescriber routeDescriber : describers) {
			final Resource request = new Resource();
			final String mUrl = routeDescriber.getPaths().get(0);
			request.setId(REQUEST_PREFIX + Util.getRandomHexString32());
			
			if (!routeDescriber.getMethods().isEmpty()) {
				request.setMethod(routeDescriber.getMethods().get(0));
			} else {
				request.setMethod("GET");
			}
			request.setParentId(parent);
			request.setName(Util.createName(mUrl, request.getMethod()));
			request.setFolder(Util.createFolderName(mUrl));
			request.setUrl("{{ base_url }}" + mUrl);
			request.setSettingEncodeUrl(true);
			request.setSettingRebuildPath(true);
			request.setSettingSendCookies(true);
			request.setSettingStoreCookies(true);
			request.setSettingDisableRenderRequestBody(true);
			request.setType("request");
			request.setAuthentication(new Authentication());
			request.setHeaders((HeadersCreator.createHeaders()));
			request.setBody(new Body());
			request.setDescription(String.format("%s %s", request.getMethod(), request.getUrl()));
			request.setParameters(new ArrayList<>());
			mResources.add(request);
		}
		return mResources;
	}
}
