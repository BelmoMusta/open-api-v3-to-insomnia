
package com.musta.belmo.openapiinsomnia.routes.objects;

import lombok.Data;

import java.util.List;

@Data

public class RouteDescriber {
    
    private List<Object> consumes;
    private List<String> methods;
    private List<Param> params;
    private List<String> paths;
    private List<String> produces;
    private String returnType;
    private Boolean returnTypeWrappedInResponseEntity;
 
}
