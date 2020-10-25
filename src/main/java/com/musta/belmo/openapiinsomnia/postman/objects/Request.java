package com.musta.belmo.openapiinsomnia.postman.objects;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Request {
    private Body body;
    private List<KeyValuePaire> header;
    private String method;
    private Url url;
}
