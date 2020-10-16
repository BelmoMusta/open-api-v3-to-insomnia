package com.musta.belmo.openapiinsomnia.insomnia;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Authentication {

    @JsonProperty("disabled")
    private Boolean disabled;

    @JsonProperty("password")
    private String password;

    @JsonProperty("type")
    private String type;

    @JsonProperty("username")
    private String username;
 
}
