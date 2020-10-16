
package com.musta.belmo.openapiinsomnia.open;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Param {

    @JsonProperty("classType")
    private String classType;
    @JsonProperty("name")
    private Object name;
    @JsonProperty("type")
    private String type;
 

}
