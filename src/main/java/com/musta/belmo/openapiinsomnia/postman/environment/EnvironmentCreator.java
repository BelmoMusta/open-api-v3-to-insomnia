package com.musta.belmo.openapiinsomnia.postman.environment;

import com.musta.belmo.openapiinsomnia.postman.environment.objects.Environment;
import com.musta.belmo.openapiinsomnia.postman.environment.objects.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class EnvironmentCreator {
	
	public static List<Environment> createEnvironments(List<String> hosts) {
		final List<Environment> envs = new ArrayList<>();
		for (String host : hosts) {
			final Environment environment = new Environment();
			environment.setId(UUID.randomUUID().toString());
			environment.setName(host);
			setValues(environment, host);
			environment.set_postmanVariableScope("environment");
			envs.add(environment);
		}
		return envs;
	}
	
	private static void setValues(Environment environment, String hostName) {
		
		final ArrayList<Value> values = new ArrayList<>();
		final Value value = new Value();
		value.setEnabled(true);
		value.setKey("url");
		value.setValue(hostName);
		values.add(value);
		environment.setValues(values);
	}
}
