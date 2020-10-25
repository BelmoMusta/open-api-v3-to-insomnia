package com.musta.belmo.openapiinsomnia.insomnia.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Getter
@Setter
public class Resource {
	private String folder;
	private Authentication authentication;
	private Body body;
	private String description;
	private List<Header> headers;
	private boolean isPrivate;
	
	private Long metaSortKey;
	
	private String method;
	
	private String name;
	
	private List<Object> parameters;
	private String parentId;
	private boolean settingDisableRenderRequestBody;
	private Boolean settingEncodeUrl;
	private String settingFollowRedirects;
	private Boolean settingRebuildPath;
	private Boolean settingSendCookies;
	private Boolean settingStoreCookies;
	
	private String url;
	
	@JsonProperty("_id")
	private String id;
	
	@JsonProperty("_type")
	private String type;
	private Map<String, String> data = new HashMap<>();
	private String color;
	
}
