package com.musta.belmo.openapiinsomnia;

import java.io.IOException;

public interface TransformerService {
	String createFromRoutesDescriberFile(String inFile, String outputFile) throws IOException;
}
