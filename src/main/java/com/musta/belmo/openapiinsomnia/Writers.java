package com.musta.belmo.openapiinsomnia;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Writers {
	public static <T> String writeToJsonFile(String outputFile, T objectToBeWritten) throws IOException {
		File writtenOutputFile = new File(outputFile);
		writeToJsonFile(writtenOutputFile, objectToBeWritten);
		return writtenOutputFile.getAbsolutePath();
		
	}
	
	private static <T> void writeToJsonFile(File outputFile, T objectToBeWritten) throws IOException {
		writeToWriter(objectToBeWritten, new FileWriter(outputFile));
	}
	
	private static <T> void writeToWriter(T objectToBeWritten, Writer writer) throws IOException {
		final ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.writeValue(writer, objectToBeWritten);
		writer.close();
	}
}
