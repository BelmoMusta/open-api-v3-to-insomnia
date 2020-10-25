package com.musta.belmo.openapiinsomnia.routes;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.musta.belmo.openapiinsomnia.routes.objects.RouteDescriber;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class RoutesService {
	public static List<RouteDescriber> readRoutesDescribers(String jsonFile) throws IOException {
		final ObjectMapper objectMapper = new ObjectMapper();
		final String content = FileUtils.readFileToString(new File(jsonFile), StandardCharsets.UTF_8);
		return objectMapper.readValue(content,
				new TypeReference<List<RouteDescriber>>() {});
	}
}
