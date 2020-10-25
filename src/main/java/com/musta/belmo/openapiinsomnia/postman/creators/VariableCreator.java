package com.musta.belmo.openapiinsomnia.postman.creators;

import com.musta.belmo.openapiinsomnia.postman.objects.Postman;
import com.musta.belmo.openapiinsomnia.postman.objects.Variable;

import java.util.ArrayList;
import java.util.UUID;

public class VariableCreator {
	
	public static void createVariables(Postman postman) {
		ArrayList<Variable> variable = new ArrayList<>();
		
		Variable username = addAVariable("username", "lmarc");
		Variable password = addAVariable("password", "test");
		
		variable.add(username);
		variable.add(password);
		
		postman.setVariable(variable);
	}
	
	private static Variable addAVariable(String name, String value) {
		final Variable variable = new Variable();
		variable.setId(UUID.randomUUID().toString());
		variable.setKey(name);
		variable.setValue(value);
		return variable;
	}
}
