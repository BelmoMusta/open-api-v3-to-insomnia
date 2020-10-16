
package com.musta.belmo.openapiinsomnia;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class ExportedInsomniaWorkSpace {

    @JsonProperty("resources")
    private List<Resource> mResources;
    @JsonProperty("__export_format")
    private Integer m_ExportFormat;
 
}
