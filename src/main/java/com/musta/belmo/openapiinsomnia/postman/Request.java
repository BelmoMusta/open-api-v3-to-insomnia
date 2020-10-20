package com.musta.belmo.openapiinsomnia.postman;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@SuppressWarnings("unused")
@Getter
@Setter
public class Request {

    
    private Body body;

    
    private List<Object> header;

    
    private String method;

    
    private Url url;
}
