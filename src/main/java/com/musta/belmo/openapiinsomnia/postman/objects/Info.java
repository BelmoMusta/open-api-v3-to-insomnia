package com.musta.belmo.openapiinsomnia.postman.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Info {
	@JsonProperty("_postman_id")
	private String _postmanId;
	private String name;
	private String schema;
}
