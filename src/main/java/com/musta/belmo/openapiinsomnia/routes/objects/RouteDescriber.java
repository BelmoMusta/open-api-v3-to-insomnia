
package com.musta.belmo.openapiinsomnia.routes.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data

public class RouteDescriber {

    @JsonProperty("consumes")
    private List<Object> consumes;
    @JsonProperty("methods")
    private List<String> methods;
    @JsonProperty("params")
    private List<Param> params;
    @JsonProperty("paths")
    private List<String> paths;
    @JsonProperty("produces")
    private List<String> produces;
    @JsonProperty("returnType")
    private String returnType;
    @JsonProperty("returnTypeWrappedInResponseEntity")
    private Boolean returnTypeWrappedInResponseEntity;
 
}
