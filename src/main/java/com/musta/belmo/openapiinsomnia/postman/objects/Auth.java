package com.musta.belmo.openapiinsomnia.postman.objects;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Auth {
    private List<Basic> basic;
    private String type;
}
