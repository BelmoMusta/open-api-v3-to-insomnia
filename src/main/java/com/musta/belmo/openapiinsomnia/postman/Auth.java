package com.musta.belmo.openapiinsomnia.postman;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@SuppressWarnings("unused")
@Getter
@Setter
public class Auth {
    private List<Basic> basic;
    private String type;
}
