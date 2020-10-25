package com.musta.belmo.openapiinsomnia.insomnia.objects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Authentication {
	private Boolean disabled;
	private String password;
	private String type;
	private String username;
}
