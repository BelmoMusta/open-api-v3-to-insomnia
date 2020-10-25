package com.musta.belmo.openapiinsomnia.insomnia.creators;

import com.musta.belmo.openapiinsomnia.Util;
import com.musta.belmo.openapiinsomnia.insomnia.objects.Resource;

import java.util.HashMap;

public class EnvironmentCreator {
	public static void createEnvironmentData(Resource environment) {
		final HashMap<String, String> map = new HashMap<>();
		map.put("base_url", "MY_BASE_URL --replace this");
		environment.setData(map);
		environment.setType("environment");
	}
	
	public static Resource createEnvironment(String parent, boolean isChild) {
		final Resource environment = new Resource();
		environment.setId("env_" + Util.getRandomHexString32());
		environment.setParentId(parent);
		if (isChild) {
			environment.setName("ENV01");
			environment.setColor("#f03000");
			
		} else {
			environment.setName("Base Environment");
		}
		createEnvironmentData(environment);
		return environment;
	}
}
