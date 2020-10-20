package com.musta.belmo.openapiinsomnia.postman;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@SuppressWarnings("unused")
@Getter
@Setter
public class Url {

    
    private List<String> host;

    
    private List<String> path;

    
    private String port;

    
    private String protocol;

    
    private String raw;
}
