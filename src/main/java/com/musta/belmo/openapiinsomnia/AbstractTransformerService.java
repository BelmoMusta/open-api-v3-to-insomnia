package com.musta.belmo.openapiinsomnia;

import com.musta.belmo.openapiinsomnia.routes.RoutesService;
import com.musta.belmo.openapiinsomnia.routes.objects.RouteDescriber;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractTransformerService  implements TransformerService{
	@Override
	public String createFromRoutesDescriberFile(String inFile, String outputFile) throws IOException {
		final List<RouteDescriber> routeDescribers = createRouteDescribers(inFile);
		return createFromRoutesDescribers(outputFile, routeDescribers);
	}
	
	protected abstract String createFromRoutesDescribers(String outputFile, List<RouteDescriber> routeDescribers) throws IOException;
	
	private List<RouteDescriber> createRouteDescribers(String jsonFile) throws IOException {
		return RoutesService.readRoutesDescribers(jsonFile)
				.stream()
				.filter(aDescriber -> !aDescriber.getPaths().isEmpty()
						&& !aDescriber.getMethods().isEmpty())
				.collect(Collectors.toList());
	}
	
}
