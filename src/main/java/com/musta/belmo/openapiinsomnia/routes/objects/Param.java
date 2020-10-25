
package com.musta.belmo.openapiinsomnia.routes.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Param {

    @JsonProperty("classType")
    private String classType;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;
 

}
