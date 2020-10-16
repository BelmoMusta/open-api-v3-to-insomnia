package com.musta.belmo.openapiinsomnia.open;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class RoutesService {
	public static List<RouteDescriber> readRoutesDescribers(String jsonFile) throws IOException {
		final ObjectMapper objectMapper = new ObjectMapper();
		final String content = FileUtils.readFileToString(new File(jsonFile), "UTF-8");
		return objectMapper.readValue(content,
				new TypeReference<List<RouteDescriber>>() {});
	}
}
