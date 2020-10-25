package com.musta.belmo.openapiinsomnia;


import com.musta.belmo.openapiinsomnia.insomnia.InsomniaTransformerService;
import com.musta.belmo.openapiinsomnia.postman.PostmanService;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		final String jsonFile;
		final String outputFile;
		TransformerService service;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the postman /insomnia import creator !");
		System.out.println("For insomnia, please input 1");
		System.out.println("For postman, please input 2");
		System.out.println("To exit input 0");
		System.out.print("Choice: ");
		int choice = -1;
		try {
			choice = sc.nextInt();
			
		} catch (Exception exception) {
			System.exit(2);
		}
		if (choice == 0) {
			System.out.println("Bye");
			System.exit(0);
		}
		System.out.println("enter the describer file");
		jsonFile = sc.next();
		if (choice == 1) {
			service = new InsomniaTransformerService();
			System.out.println("Enter the insomnia output file");
			outputFile = sc.next();
		} else if (choice == 2) {
			service = new PostmanService();
			System.out.println("Enter the postman output file");
			outputFile = sc.next();
			
		} else {
			service = null;
			outputFile = null;
			System.exit(2);
			
		}
		final String writtenFile = service.createFromRoutesDescriberFile(jsonFile, outputFile);
		System.out.println("written to file  : " + writtenFile);
		
		
	}
}
