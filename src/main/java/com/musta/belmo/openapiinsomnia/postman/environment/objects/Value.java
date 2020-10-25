
package com.musta.belmo.openapiinsomnia.postman.environment.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Value {

   @JsonProperty("enabled")
    private Boolean mEnabled;
   @JsonProperty("key")
    private String mKey;
   @JsonProperty("value")
    private String mValue;

    public Boolean getEnabled() {
        return mEnabled;
    }

    public void setEnabled(Boolean enabled) {
        mEnabled = enabled;
    }

    public String getKey() {
        return mKey;
    }

    public void setKey(String key) {
        mKey = key;
    }

    public String getValue() {
        return mValue;
    }

    public void setValue(String value) {
        mValue = value;
    }

}
