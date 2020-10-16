
package com.musta.belmo.openapiinsomnia.open;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Param {

    @JsonProperty("classType")
    private String mClassType;
    @JsonProperty("name")
    private Object mName;
    @JsonProperty("type")
    private String mType;
 

}
