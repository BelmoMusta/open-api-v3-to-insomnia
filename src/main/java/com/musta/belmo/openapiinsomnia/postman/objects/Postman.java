package com.musta.belmo.openapiinsomnia.postman.objects;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Postman {
    private Auth auth;
    private Info info;
    private List<Item> item;
    private List<Variable> variable;
}
