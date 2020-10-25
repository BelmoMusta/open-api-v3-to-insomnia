package com.musta.belmo.openapiinsomnia;

import com.musta.belmo.openapiinsomnia.routes.RoutesService;
import com.musta.belmo.openapiinsomnia.routes.objects.RouteDescriber;

import java.io.IOException;
import java.util.List;

public abstract class AbstractTransformerService  implements TransformerService{
	@Override
	public String createFromRoutesDescriberFile(String inFile, String outputFile) throws IOException {
		final List<RouteDescriber> routeDescribers = RoutesService.readRoutesDescribers(inFile);
		return createFromRoutesDescribers(outputFile, routeDescribers);
	}
	protected abstract String createFromRoutesDescribers(String outputFile, List<RouteDescriber> routeDescribers) throws IOException;
	
}
