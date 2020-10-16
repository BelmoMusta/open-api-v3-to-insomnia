package com.musta.belmo.openapiinsomnia;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Resource {
	
	@JsonProperty("authentication")
	private Authentication mAuthentication;
	
	@JsonProperty("body")
	private Body mBody;
	
	@JsonProperty("description")
	private String mDescription;
	
	@JsonProperty("headers")
	private List<Object> mHeaders;
	
	@JsonProperty("isPrivate")
	private boolean mIsPrivate;
	
	@JsonProperty("metaSortKey")
	private Long mMetaSortKey;
	
	@JsonProperty(value = "method" , defaultValue = "GET")
	private String mMethod;
	
	@JsonProperty("name")
	private String mName;
	
	@JsonProperty("parameters")
	private List<Object> mParameters;
	
	@JsonProperty("parentId")
	private String mParentId;
	
	@JsonProperty("settingDisableRenderRequestBody")
	private boolean mSettingDisableRenderRequestBody;
	
	@JsonProperty(value = "settingEncodeUrl", defaultValue = "true")
	private Boolean mSettingEncodeUrl;
	
	@JsonProperty("settingFollowRedirects")
	private String mSettingFollowRedirects;
	
	@JsonProperty(value = "settingRebuildPath", defaultValue = "true")
	private Boolean mSettingRebuildPath;
	
	@JsonProperty(value = "settingSendCookies", defaultValue = "true")
	private Boolean mSettingSendCookies;
	
	@JsonProperty(value = "settingStoreCookies",defaultValue = "true")
	private Boolean mSettingStoreCookies;
	
	@JsonProperty("url")
	private String mUrl;
	
	@JsonProperty("_id")
	private String m_id;
	
	@JsonProperty("_type")
	private String m_type;
	
}
