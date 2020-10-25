
package com.musta.belmo.openapiinsomnia.postman.environment.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;
import java.util.List;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Environment {
	
	@JsonProperty("id")
	private String mId;
	@JsonProperty("name")
	private String mName;
	@JsonProperty("values")
	private List<Value> mValues;
	@JsonProperty("_postman_exported_at")
	private String m_postmanExportedAt;
	@JsonProperty("_postman_exported_using")
	private String m_postmanExportedUsing;
	@JsonProperty("_postman_variable_scope")
	private String m_postmanVariableScope;
	
	public String getId() {
		return mId;
	}
	
	public void setId(String id) {
		mId = id;
	}
	
	public String getName() {
		return mName;
	}
	
	public void setName(String name) {
		mName = name;
	}
	
	public List<Value> getValues() {
		return mValues;
	}
	
	public void setValues(List<Value> values) {
		mValues = values;
	}
	
	public String get_postmanExportedAt() {
		return m_postmanExportedAt;
	}
	
	public void set_postmanExportedAt(String _postmanExportedAt) {
		m_postmanExportedAt = _postmanExportedAt;
	}
	
	public String get_postmanExportedUsing() {
		return m_postmanExportedUsing;
	}
	
	public void set_postmanExportedUsing(String _postmanExportedUsing) {
		m_postmanExportedUsing = _postmanExportedUsing;
	}
	
	public String get_postmanVariableScope() {
		return m_postmanVariableScope;
	}
	
	public void set_postmanVariableScope(String _postmanVariableScope) {
		m_postmanVariableScope = _postmanVariableScope;
	}
	
}
