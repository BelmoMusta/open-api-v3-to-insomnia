package com.musta.belmo.openapiinsomnia;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Authentication {

    @JsonProperty("disabled")
    private Boolean mDisabled;

    @JsonProperty("password")
    private String mPassword;

    @JsonProperty("type")
    private String mType;

    @JsonProperty("username")
    private String mUsername;
 
}
