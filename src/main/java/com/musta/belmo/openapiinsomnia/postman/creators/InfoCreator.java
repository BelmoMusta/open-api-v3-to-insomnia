package com.musta.belmo.openapiinsomnia.postman.creators;

import com.musta.belmo.openapiinsomnia.postman.objects.Info;
import com.musta.belmo.openapiinsomnia.postman.objects.Postman;

import java.util.UUID;

public class InfoCreator {
	public static void createInfo(Postman postman) {
		Info info = new Info();
		info.set_postmanId(UUID.randomUUID().toString());
		info.setName("POSTMAN-IMPORT");
		info.setSchema("https://schema.getpostman.com/json/collection/v2.1.0/collection.json");
		
		postman.setInfo(info);
	}
}
