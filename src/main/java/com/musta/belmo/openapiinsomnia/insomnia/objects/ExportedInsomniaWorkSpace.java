
package com.musta.belmo.openapiinsomnia.insomnia.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class ExportedInsomniaWorkSpace {
    
    private List<Resource> resources;
    @JsonProperty("__export_format")
    private Integer exportFormat;
 
}
