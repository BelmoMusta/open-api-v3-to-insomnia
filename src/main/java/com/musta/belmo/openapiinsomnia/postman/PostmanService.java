package com.musta.belmo.openapiinsomnia.postman;

import com.musta.belmo.openapiinsomnia.AbstractTransformerService;
import com.musta.belmo.openapiinsomnia.Writers;
import com.musta.belmo.openapiinsomnia.postman.creators.AuthCreator;
import com.musta.belmo.openapiinsomnia.postman.creators.InfoCreator;
import com.musta.belmo.openapiinsomnia.postman.creators.ItemsCreatore;
import com.musta.belmo.openapiinsomnia.postman.creators.VariableCreator;
import com.musta.belmo.openapiinsomnia.postman.objects.Postman;
import com.musta.belmo.openapiinsomnia.routes.objects.RouteDescriber;

import java.io.IOException;
import java.util.List;

public class PostmanService extends AbstractTransformerService {
	@Override
	public String createFromRoutesDescribers(String outputFile, List<RouteDescriber> describers) throws IOException {
		final Postman postman = new Postman();
		AuthCreator.createAuth(postman);
		InfoCreator.createInfo(postman);
		ItemsCreatore.createItems(postman, describers);
		VariableCreator.createVariables(postman);
		return Writers.writeToJsonFile(outputFile, postman);
	}
}
