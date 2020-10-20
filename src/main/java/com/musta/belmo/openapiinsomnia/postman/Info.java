package com.musta.belmo.openapiinsomnia.postman;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


@SuppressWarnings("unused")
@Getter
@Setter
public class Info {

    @JsonProperty("_postman_id")
    private String _postmanId;
    private String name;
    private String schema;
}
