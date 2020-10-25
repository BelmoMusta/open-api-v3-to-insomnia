package com.musta.belmo.openapiinsomnia.postman.creators;

import com.musta.belmo.openapiinsomnia.postman.objects.Auth;
import com.musta.belmo.openapiinsomnia.postman.objects.Basic;
import com.musta.belmo.openapiinsomnia.postman.objects.Postman;

import java.util.ArrayList;

public class AuthCreator {
	private AuthCreator(){
		throw new IllegalStateException("Cannot be instantiated");
	}
	public static void createAuth(Postman postman) {
		final Auth auth = new Auth();
		final ArrayList<Basic> basic = new ArrayList<>();
		final Basic username = new Basic();
		username.setKey("username");
		username.setType("string");
		username.setValue("{{username}}");
		
		
		final Basic password = new Basic();
		password.setKey("password");
		password.setType("string");
		password.setValue("{{password}}");
		basic.add(username);
		basic.add(password);
		auth.setBasic(basic);
		auth.setType("basic");
		
		postman.setAuth(auth);
	}
}
