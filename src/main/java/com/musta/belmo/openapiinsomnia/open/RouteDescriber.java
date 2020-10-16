
package com.musta.belmo.openapiinsomnia.open;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data

public class RouteDescriber {

    @JsonProperty("consumes")
    private List<Object> mConsumes;
    @JsonProperty("methods")
    private List<String> mMethods;
    @JsonProperty("params")
    private List<Param> mParams;
    @JsonProperty("paths")
    private List<String> mPaths;
    @JsonProperty("produces")
    private List<String> mProduces;
    @JsonProperty("returnType")
    private String mReturnType;
    @JsonProperty("returnTypeWrappedInResponseEntity")
    private Boolean mReturnTypeWrappedInResponseEntity;
 
}
