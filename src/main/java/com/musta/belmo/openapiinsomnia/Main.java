package com.musta.belmo.openapiinsomnia;

public class Main {
	public static void main(String[] args) throws Exception {
		final String jsonFile;
		final String outputFile;
		if (args.length == 2) {
			jsonFile = args[0];
			outputFile = args[1];
		} else {
			System.out.println("There should be two files !");
			System.exit(2);
			return;
		}
		Service.createInsomniaImportFile(jsonFile, outputFile);
	}
}
