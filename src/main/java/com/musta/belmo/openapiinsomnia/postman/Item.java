package com.musta.belmo.openapiinsomnia.postman;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@SuppressWarnings("unused")
@Getter
@Setter
public class Item {
    private String name;

    
    private ProtocolProfileBehavior protocolProfileBehavior;

    
    private Request request;

    
    private List<Object> response;
}
