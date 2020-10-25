package com.musta.belmo.openapiinsomnia.postman.creators;

import com.musta.belmo.openapiinsomnia.Util;
import com.musta.belmo.openapiinsomnia.postman.objects.Body;
import com.musta.belmo.openapiinsomnia.postman.objects.Item;
import com.musta.belmo.openapiinsomnia.postman.objects.KeyValuePaire;
import com.musta.belmo.openapiinsomnia.postman.objects.Request;
import com.musta.belmo.openapiinsomnia.postman.objects.Url;
import com.musta.belmo.openapiinsomnia.routes.objects.Param;
import com.musta.belmo.openapiinsomnia.routes.objects.RouteDescriber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RequestCreators {
	public static void setRequest(Item anItem, RouteDescriber describer) {
		final Request request = new Request();
		final Body body = new Body();
		body.setMode("raw");
		body.setRaw("");
		
		request.setBody(body);
		final ArrayList<KeyValuePaire> header = new ArrayList<>();
		final KeyValuePaire headerK = new KeyValuePaire();
		headerK.setValue("application/json");
		headerK.setKey("Content-Type");
		header.add(headerK);
		request.setHeader(header);
		request.setMethod(describer.getMethods().get(0));
		
		final Url url = new Url();
		final String path = describer.getPaths().get(0);
		anItem.setFolder(Util.createFolderName(path));
		url.setHost(Arrays.asList("{{url}}"));
		url.setProtocol("https");
		url.setPath(Arrays.asList(path.split("/")));
		url.setRaw("{{url}}" + path);
		setQueryParams(describer, url);
		request.setUrl(url);
		
		anItem.setRequest(request);
	}
	
	private static void setQueryParams(RouteDescriber describer, Url url) {
		final List<KeyValuePaire> query = new ArrayList<>();
		
		final List<Param> params = describer.getParams().stream()
				.filter(param -> "RequestParam".equals(param.getType()))
				.collect(Collectors.toList());
		
		for (Param param : params) {
			final KeyValuePaire keyValue = new KeyValuePaire();
			query.add(keyValue);
			keyValue.setKey(param.getName());
			keyValue.setDescription("java class = " + param.getClassType());
			if (param.getClassType().contains("String")) {
				keyValue.setValue("default value of " + param.getName() );
			} else if (param.getClassType().toLowerCase().contains("long")) {
				keyValue.setValue("0");
			} else if (param.getClassType().toLowerCase().contains("integer")) {
				keyValue.setValue("0");
			} else if (param.getClassType().toLowerCase().contains("boolean")) {
				keyValue.setValue("false");
			}
		}
		url.setQuery(query);
	}
	
}
