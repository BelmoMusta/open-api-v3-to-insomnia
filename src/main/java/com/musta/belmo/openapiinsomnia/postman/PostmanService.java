package com.musta.belmo.openapiinsomnia.postman;

import java.util.ArrayList;

public class PostmanService {
	public static void main(String[] args) {
		Postman postman = new Postman();
		setAuth(postman);
		setInfo(postman);
		setItems(postman);
		setVariables(postman);
		
		
	}
	
	private static void setAuth(Postman postman) {
		Auth auth = new Auth();
		ArrayList<Basic> basic = new ArrayList<>();
		auth.setBasic(basic);
		auth.setType("");
		
		postman.setAuth(auth);
	}
	
	private static void setInfo(Postman postman) {
		Info info = new Info();
		info.set_postmanId("");
		info.setName("");
		info.setSchema("");
		
		postman.setInfo(info);
	}
	
	private static void setVariables(Postman postman) {
		ArrayList<Variable> variable = new ArrayList<>();
		postman.setVariable(variable);
	}
	
	private static void setItems(Postman postman) {
		ArrayList<Item> item = new ArrayList<>();
		postman.setItem(item);
	}
}
