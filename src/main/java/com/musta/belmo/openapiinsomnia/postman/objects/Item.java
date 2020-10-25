package com.musta.belmo.openapiinsomnia.postman.objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@SuppressWarnings("unused")
@Getter
@Setter
public class Item {
    @JsonIgnore
    private String folder;
    private String name;
    private ProtocolProfileBehavior protocolProfileBehavior;
    private Request request;
    private List<Object> response;
    @JsonProperty("item")
    List<Item> subItems;
    
   
}
