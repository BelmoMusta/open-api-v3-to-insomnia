package com.musta.belmo.openapiinsomnia.insomnia;

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
	
	@JsonProperty("authentication")
	private Authentication authentication;
	
	@JsonProperty("body")
	private Body body;
	
	@JsonProperty("description")
	private String description;
	
	@JsonProperty("headers")
	private List<Header> headers;
	
	@JsonProperty("isPrivate")
	private boolean isPrivate;
	
	@JsonProperty("metaSortKey")
	private Long metaSortKey;
	
	@JsonProperty(value = "method", defaultValue = "GET")
	private String method;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("parameters")
	private List<Object> parameters;
	
	@JsonProperty("parentId")
	private String parentId;
	
	@JsonProperty("settingDisableRenderRequestBody")
	private boolean settingDisableRenderRequestBody;
	
	@JsonProperty(value = "settingEncodeUrl", defaultValue = "true")
	private Boolean settingEncodeUrl;
	
	@JsonProperty("settingFollowRedirects")
	private String settingFollowRedirects;
	
	@JsonProperty(value = "settingRebuildPath", defaultValue = "true")
	private Boolean settingRebuildPath;
	
	@JsonProperty(value = "settingSendCookies", defaultValue = "true")
	private Boolean settingSendCookies;
	
	@JsonProperty(value = "settingStoreCookies", defaultValue = "true")
	private Boolean settingStoreCookies;
	
	@JsonProperty("url")
	private String url;
	
	@JsonProperty("_id")
	private String id;
	
	@JsonProperty("_type")
	private String type;
	
	@JsonProperty("data")
	private Map<String, String> data = new HashMap<>();
	@JsonProperty("color")
	private String color;
	
}
