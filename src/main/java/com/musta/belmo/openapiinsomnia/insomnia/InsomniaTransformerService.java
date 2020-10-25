package com.musta.belmo.openapiinsomnia.insomnia;

import com.musta.belmo.openapiinsomnia.AbstractTransformerService;
import com.musta.belmo.openapiinsomnia.Writers;
import com.musta.belmo.openapiinsomnia.insomnia.adapter.Adapter;
import com.musta.belmo.openapiinsomnia.insomnia.objects.ExportedInsomniaWorkSpace;
import com.musta.belmo.openapiinsomnia.routes.objects.RouteDescriber;

import java.io.IOException;
import java.util.List;

public class InsomniaTransformerService extends AbstractTransformerService {
	
	@Override
	protected String createFromRoutesDescribers(String outputFile, List<RouteDescriber> routeDescribers) throws IOException{
		final ExportedInsomniaWorkSpace exportedInsomniaWorkSpace = Adapter.adaptToInsomniaWorkspace(routeDescribers);
		return Writers.writeToJsonFile(outputFile, exportedInsomniaWorkSpace);
	}
}
