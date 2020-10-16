
package com.musta.belmo.openapiinsomnia.insomnia;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Header {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("value")
    private String value;


}
