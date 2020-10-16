package com.musta.belmo.openapiinsomnia;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.musta.belmo.openapiinsomnia.open.RouteDescriber;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
	public static void main(String[] args) throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		List<RouteDescriber> list = objectMapper.readValue("[\n" +
				"  {\n" +
				"    \"returnType\": \"java.util.Set<musta.belmo.rekommand.model.CommentDTO>\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": false,\n" +
				"    \"paths\": [\n" +
				"      \"/comment/post/{postId}\"\n" +
				"    ],\n" +
				"    \"methods\": [\n" +
				"      \"GET\"\n" +
				"    ],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": [\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"RequestParam\",\n" +
				"        \"classType\": \"java.lang.Long\"\n" +
				"      }\n" +
				"    ]\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"java.util.Set<musta.belmo.rekommand.model.CommentDTO>\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": false,\n" +
				"    \"paths\": [\n" +
				"      \"/comment/\"\n" +
				"    ],\n" +
				"    \"methods\": [\n" +
				"      \"GET\"\n" +
				"    ],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": []\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"musta.belmo.rekommand.model.CommentDTO\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": false,\n" +
				"    \"paths\": [\n" +
				"      \"/comment/{id}\"\n" +
				"    ],\n" +
				"    \"methods\": [\n" +
				"      \"GET\"\n" +
				"    ],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": [\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"RequestParam\",\n" +
				"        \"classType\": \"java.lang.Long\"\n" +
				"      }\n" +
				"    ]\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"musta.belmo.rekommand.model.CommentDTO\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": false,\n" +
				"    \"paths\": [\n" +
				"      \"/comment/{id}\"\n" +
				"    ],\n" +
				"    \"methods\": [\n" +
				"      \"PUT\"\n" +
				"    ],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": [\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"RequestParam\",\n" +
				"        \"classType\": \"java.lang.Long\"\n" +
				"      },\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"RequestParam\",\n" +
				"        \"classType\": \"musta.belmo.rekommand.model.CommentDTO\"\n" +
				"      }\n" +
				"    ]\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"musta.belmo.rekommand.model.CommentDTO\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": false,\n" +
				"    \"paths\": [\n" +
				"      \"/comment/\"\n" +
				"    ],\n" +
				"    \"methods\": [\n" +
				"      \"POST\"\n" +
				"    ],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": [\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"RequestBody\",\n" +
				"        \"classType\": \"musta.belmo.rekommand.model.CommentDTO\"\n" +
				"      }\n" +
				"    ]\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"void\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": false,\n" +
				"    \"paths\": [\n" +
				"      \"/comment/{postId}\"\n" +
				"    ],\n" +
				"    \"methods\": [\n" +
				"      \"POST\"\n" +
				"    ],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": [\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"PathVariable\",\n" +
				"        \"classType\": \"java.lang.Long\"\n" +
				"      },\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"RequestBody\",\n" +
				"        \"classType\": \"musta.belmo.rekommand.model.CommentDTO\"\n" +
				"      }\n" +
				"    ]\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"void\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": false,\n" +
				"    \"paths\": [\n" +
				"      \"/comment/{commentId}\"\n" +
				"    ],\n" +
				"    \"methods\": [\n" +
				"      \"DELETE\"\n" +
				"    ],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": [\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"PathVariable\",\n" +
				"        \"classType\": \"java.lang.Long\"\n" +
				"      }\n" +
				"    ]\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"musta.belmo.rekommand.model.CommentDTO\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": false,\n" +
				"    \"paths\": [\n" +
				"      \"/comment/{originalComment}/reply\"\n" +
				"    ],\n" +
				"    \"methods\": [\n" +
				"      \"POST\"\n" +
				"    ],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": [\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"PathVariable\",\n" +
				"        \"classType\": \"java.lang.Long\"\n" +
				"      },\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"RequestBody\",\n" +
				"        \"classType\": \"musta.belmo.rekommand.model.CommentDTO\"\n" +
				"      }\n" +
				"    ]\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"org.springframework.http.ResponseEntity\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": true,\n" +
				"    \"paths\": [\n" +
				"      \"/interaction/comment/{commentId}/interact\"\n" +
				"    ],\n" +
				"    \"methods\": [\n" +
				"      \"POST\"\n" +
				"    ],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": [\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"PathVariable\",\n" +
				"        \"classType\": \"java.lang.Long\"\n" +
				"      },\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"RequestParam\",\n" +
				"        \"classType\": \"musta.belmo.rekommand.data.model.enums.InteractionType\"\n" +
				"      }\n" +
				"    ]\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"org.springframework.http.ResponseEntity\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": true,\n" +
				"    \"paths\": [\n" +
				"      \"/interaction/post/{postId}/interact\"\n" +
				"    ],\n" +
				"    \"methods\": [\n" +
				"      \"POST\"\n" +
				"    ],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": [\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"PathVariable\",\n" +
				"        \"classType\": \"java.lang.Long\"\n" +
				"      },\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"RequestParam\",\n" +
				"        \"classType\": \"musta.belmo.rekommand.data.model.enums.InteractionType\"\n" +
				"      }\n" +
				"    ]\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"org.springframework.http.ResponseEntity\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": true,\n" +
				"    \"paths\": [\n" +
				"      \"/interaction/post/{postId}/save\"\n" +
				"    ],\n" +
				"    \"methods\": [\n" +
				"      \"POST\"\n" +
				"    ],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": [\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"PathVariable\",\n" +
				"        \"classType\": \"java.lang.Long\"\n" +
				"      }\n" +
				"    ]\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"org.springframework.http.ResponseEntity\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": true,\n" +
				"    \"paths\": [\n" +
				"      \"/interaction/post/{postId}/unsave\"\n" +
				"    ],\n" +
				"    \"methods\": [\n" +
				"      \"POST\"\n" +
				"    ],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": [\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"PathVariable\",\n" +
				"        \"classType\": \"java.lang.Long\"\n" +
				"      }\n" +
				"    ]\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"org.springframework.http.ResponseEntity\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": true,\n" +
				"    \"paths\": [\n" +
				"      \"/interaction/post/{postId}/clear\"\n" +
				"    ],\n" +
				"    \"methods\": [\n" +
				"      \"DELETE\"\n" +
				"    ],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": [\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"PathVariable\",\n" +
				"        \"classType\": \"java.lang.Long\"\n" +
				"      }\n" +
				"    ]\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"org.springframework.http.ResponseEntity\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": true,\n" +
				"    \"paths\": [\n" +
				"      \"/interaction/post/{postId}/rate\"\n" +
				"    ],\n" +
				"    \"methods\": [\n" +
				"      \"POST\"\n" +
				"    ],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": [\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"PathVariable\",\n" +
				"        \"classType\": \"java.lang.Long\"\n" +
				"      },\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"RequestParam\",\n" +
				"        \"classType\": \"musta.belmo.rekommand.data.model.Rate\"\n" +
				"      }\n" +
				"    ]\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"musta.belmo.rekommand.model.PictureDTO\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": false,\n" +
				"    \"paths\": [\n" +
				"      \"/picture/id\"\n" +
				"    ],\n" +
				"    \"methods\": [\n" +
				"      \"GET\"\n" +
				"    ],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": [\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"RequestParam\",\n" +
				"        \"classType\": \"java.lang.Long\"\n" +
				"      }\n" +
				"    ]\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"musta.belmo.rekommand.model.PictureDTO\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": true,\n" +
				"    \"paths\": [\n" +
				"      \"/picture/upload\"\n" +
				"    ],\n" +
				"    \"methods\": [\n" +
				"      \"POST\"\n" +
				"    ],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": [\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"RequestParam\",\n" +
				"        \"classType\": \"org.springframework.web.multipart.MultipartFile\"\n" +
				"      }\n" +
				"    ]\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"org.springframework.core.io.Resource\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": true,\n" +
				"    \"paths\": [\n" +
				"      \"/picture/{uuid}\"\n" +
				"    ],\n" +
				"    \"methods\": [\n" +
				"      \"GET\"\n" +
				"    ],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [\n" +
				"      \"application/octet-stream\"\n" +
				"    ],\n" +
				"    \"params\": [\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"PathVariable\",\n" +
				"        \"classType\": \"java.lang.String\"\n" +
				"      }\n" +
				"    ]\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"java.util.Set<musta.belmo.rekommand.model.PostDTO>\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": false,\n" +
				"    \"paths\": [\n" +
				"      \"/post/\"\n" +
				"    ],\n" +
				"    \"methods\": [\n" +
				"      \"GET\"\n" +
				"    ],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": []\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"musta.belmo.rekommand.model.PostDTO\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": false,\n" +
				"    \"paths\": [\n" +
				"      \"/post/{id}\"\n" +
				"    ],\n" +
				"    \"methods\": [\n" +
				"      \"GET\"\n" +
				"    ],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": [\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"PathVariable\",\n" +
				"        \"classType\": \"java.lang.Long\"\n" +
				"      }\n" +
				"    ]\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"java.util.Set<musta.belmo.rekommand.model.PostDTO>\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": false,\n" +
				"    \"paths\": [\n" +
				"      \"/post/saved\"\n" +
				"    ],\n" +
				"    \"methods\": [\n" +
				"      \"GET\"\n" +
				"    ],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": []\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"musta.belmo.rekommand.model.PostDTO\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": false,\n" +
				"    \"paths\": [\n" +
				"      \"/post/test/{id}\"\n" +
				"    ],\n" +
				"    \"methods\": [\n" +
				"      \"GET\"\n" +
				"    ],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": [\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"PathVariable\",\n" +
				"        \"classType\": \"java.lang.Long\"\n" +
				"      }\n" +
				"    ]\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"java.util.Set<musta.belmo.rekommand.model.PostDTO>\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": false,\n" +
				"    \"paths\": [\n" +
				"      \"/post/tags\"\n" +
				"    ],\n" +
				"    \"methods\": [\n" +
				"      \"GET\"\n" +
				"    ],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": [\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"RequestParam\",\n" +
				"        \"classType\": \"java.lang.String\"\n" +
				"      }\n" +
				"    ]\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"org.springframework.data.domain.Page<musta.belmo.rekommand.model.PostDTO>\"," +
				"\n" +
				"    \"returnTypeWrappedInResponseEntity\": false,\n" +
				"    \"paths\": [\n" +
				"      \"/post/search\"\n" +
				"    ],\n" +
				"    \"methods\": [\n" +
				"      \"GET\"\n" +
				"    ],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": [\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"RequestParam\",\n" +
				"        \"classType\": \"com.querydsl.core.types.Predicate\"\n" +
				"      },\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"RequestParam\",\n" +
				"        \"classType\": \"musta.belmo.rekommand.model.SearchPostDTO\"\n" +
				"      },\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"RequestParam\",\n" +
				"        \"classType\": \"org.springframework.data.domain.Pageable\"\n" +
				"      }\n" +
				"    ]\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"java.util.List<musta.belmo.rekommand.model.RouteDto\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": true,\n" +
				"    \"paths\": [\n" +
				"      \"/post/interne/restRoutes\"\n" +
				"    ],\n" +
				"    \"methods\": [\n" +
				"      \"GET\"\n" +
				"    ],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [\n" +
				"      \"application/json\"\n" +
				"    ],\n" +
				"    \"params\": []\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"void\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": false,\n" +
				"    \"paths\": [\n" +
				"      \"/post/{id}\"\n" +
				"    ],\n" +
				"    \"methods\": [\n" +
				"      \"DELETE\"\n" +
				"    ],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": [\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"RequestParam\",\n" +
				"        \"classType\": \"java.lang.Long\"\n" +
				"      }\n" +
				"    ]\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"musta.belmo.rekommand.model.PostDTO\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": true,\n" +
				"    \"paths\": [\n" +
				"      \"/post/\"\n" +
				"    ],\n" +
				"    \"methods\": [\n" +
				"      \"POST\"\n" +
				"    ],\n" +
				"    \"consumes\": [\n" +
				"      \"application/json\"\n" +
				"    ],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": [\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"RequestBody\",\n" +
				"        \"classType\": \"musta.belmo.rekommand.model.PostDTO\"\n" +
				"      }\n" +
				"    ]\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"void\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": false,\n" +
				"    \"paths\": [\n" +
				"      \"/post/{id}/tags\"\n" +
				"    ],\n" +
				"    \"methods\": [\n" +
				"      \"POST\"\n" +
				"    ],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": [\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"PathVariable\",\n" +
				"        \"classType\": \"java.lang.Long\"\n" +
				"      },\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"RequestParam\",\n" +
				"        \"classType\": \"java.lang.String\"\n" +
				"      }\n" +
				"    ]\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"void\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": false,\n" +
				"    \"paths\": [\n" +
				"      \"/post/{id}/share\"\n" +
				"    ],\n" +
				"    \"methods\": [\n" +
				"      \"POST\"\n" +
				"    ],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": [\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"PathVariable\",\n" +
				"        \"classType\": \"java.lang.Long\"\n" +
				"      },\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"RequestBody\",\n" +
				"        \"classType\": \"java.lang.String\"\n" +
				"      }\n" +
				"    ]\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"musta.belmo.rekommand.model.ProfileDTO\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": false,\n" +
				"    \"paths\": [\n" +
				"      \"/profile/{userId}\"\n" +
				"    ],\n" +
				"    \"methods\": [\n" +
				"      \"GET\"\n" +
				"    ],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": [\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"PathVariable\",\n" +
				"        \"classType\": \"java.lang.Long\"\n" +
				"      }\n" +
				"    ]\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"musta.belmo.rekommand.model.ProfileDTO\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": false,\n" +
				"    \"paths\": [\n" +
				"      \"/profile/\"\n" +
				"    ],\n" +
				"    \"methods\": [\n" +
				"      \"GET\"\n" +
				"    ],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": []\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"musta.belmo.rekommand.model.ProfileDTO\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": false,\n" +
				"    \"paths\": [\n" +
				"      \"/profile/{userId}\"\n" +
				"    ],\n" +
				"    \"methods\": [\n" +
				"      \"POST\"\n" +
				"    ],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": [\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"PathVariable\",\n" +
				"        \"classType\": \"java.lang.Long\"\n" +
				"      },\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"RequestBody\",\n" +
				"        \"classType\": \"musta.belmo.rekommand.model.ProfileDTO\"\n" +
				"      }\n" +
				"    ]\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"musta.belmo.rekommand.model.ProfileDTO\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": false,\n" +
				"    \"paths\": [\n" +
				"      \"/profile/\"\n" +
				"    ],\n" +
				"    \"methods\": [\n" +
				"      \"POST\"\n" +
				"    ],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": [\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"RequestBody\",\n" +
				"        \"classType\": \"musta.belmo.rekommand.model.ProfileDTO\"\n" +
				"      }\n" +
				"    ]\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"boolean\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": false,\n" +
				"    \"paths\": [\n" +
				"      \"/relationship/{id}/accept\"\n" +
				"    ],\n" +
				"    \"methods\": [\n" +
				"      \"POST\"\n" +
				"    ],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": [\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"PathVariable\",\n" +
				"        \"classType\": \"java.lang.Long\"\n" +
				"      }\n" +
				"    ]\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"boolean\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": false,\n" +
				"    \"paths\": [\n" +
				"      \"/relationship/{id}/send\"\n" +
				"    ],\n" +
				"    \"methods\": [\n" +
				"      \"POST\"\n" +
				"    ],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": [\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"PathVariable\",\n" +
				"        \"classType\": \"java.lang.Long\"\n" +
				"      }\n" +
				"    ]\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"java.lang.String\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": false,\n" +
				"    \"paths\": [\n" +
				"      \"/\"\n" +
				"    ],\n" +
				"    \"methods\": [\n" +
				"      \"GET\"\n" +
				"    ],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": []\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"java.lang.Void\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": true,\n" +
				"    \"paths\": [\n" +
				"      \"/user/logout\"\n" +
				"    ],\n" +
				"    \"methods\": [\n" +
				"      \"POST\"\n" +
				"    ],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": [\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"RequestParam\",\n" +
				"        \"classType\": \"javax.servlet.http.HttpServletRequest\"\n" +
				"      },\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"RequestParam\",\n" +
				"        \"classType\": \"javax.servlet.http.HttpServletResponse\"\n" +
				"      }\n" +
				"    ]\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"java.lang.String\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": true,\n" +
				"    \"paths\": [\n" +
				"      \"/user/registration\"\n" +
				"    ],\n" +
				"    \"methods\": [\n" +
				"      \"POST\"\n" +
				"    ],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": [\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"RequestBody\",\n" +
				"        \"classType\": \"musta.belmo.rekommand.model.UserRegistrationDTO\"\n" +
				"      }\n" +
				"    ]\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"musta.belmo.rekommand.model.UserRegistrationDTO\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": true,\n" +
				"    \"paths\": [\n" +
				"      \"/user/login\"\n" +
				"    ],\n" +
				"    \"methods\": [\n" +
				"      \"POST\"\n" +
				"    ],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": [\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"RequestBody\",\n" +
				"        \"classType\": \"musta.belmo.rekommand.model.UserRegistrationDTO\"\n" +
				"      }\n" +
				"    ]\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"springfox.documentation.swagger.web.SecurityConfiguration\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": true,\n" +
				"    \"paths\": [\n" +
				"      \"/swagger-resources/configuration/security\"\n" +
				"    ],\n" +
				"    \"methods\": [],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": []\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"java.util.List<springfox.documentation.swagger.web.SwaggerResource\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": true,\n" +
				"    \"paths\": [\n" +
				"      \"/swagger-resources\"\n" +
				"    ],\n" +
				"    \"methods\": [],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": []\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"springfox.documentation.swagger.web.UiConfiguration\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": true,\n" +
				"    \"paths\": [\n" +
				"      \"/swagger-resources/configuration/ui\"\n" +
				"    ],\n" +
				"    \"methods\": [],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": []\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"java.util.Map<java.lang.String, java.lang.Object\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": true,\n" +
				"    \"paths\": [\n" +
				"      \"/error\"\n" +
				"    ],\n" +
				"    \"methods\": [],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [],\n" +
				"    \"params\": [\n" +
				"      {\n" +
				"        \"name\": \"request\",\n" +
				"        \"type\": \"RequestParam\",\n" +
				"        \"classType\": \"javax.servlet.http.HttpServletRequest\"\n" +
				"      }\n" +
				"    ]\n" +
				"  },\n" +
				"  {\n" +
				"    \"returnType\": \"org.springframework.web.servlet.ModelAndView\",\n" +
				"    \"returnTypeWrappedInResponseEntity\": false,\n" +
				"    \"paths\": [\n" +
				"      \"/error\"\n" +
				"    ],\n" +
				"    \"methods\": [],\n" +
				"    \"consumes\": [],\n" +
				"    \"produces\": [\n" +
				"      \"text/html\"\n" +
				"    ],\n" +
				"    \"params\": [\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"RequestParam\",\n" +
				"        \"classType\": \"javax.servlet.http.HttpServletRequest\"\n" +
				"      },\n" +
				"      {\n" +
				"        \"name\": null,\n" +
				"        \"type\": \"RequestParam\",\n" +
				"        \"classType\": \"javax.servlet.http.HttpServletResponse\"\n" +
				"      }\n" +
				"    ]\n" +
				"  }\n" +
				"]", new TypeReference<List<RouteDescriber>>() { });
		
		ExportedInsomniaWorkSpace exportedInsomniaWorkSpace = new ExportedInsomniaWorkSpace();
		exportedInsomniaWorkSpace.setM_ExportFormat(4);
		List<Resource> mResources = new ArrayList<>();
		exportedInsomniaWorkSpace.setMResources(mResources);
		
		Resource woSpace = new Resource();
		String parent = "wrk_" + getRandomHexString(32);
		woSpace.setM_id(parent);
		woSpace.setM_type("workspace");
		woSpace.setMName("NEW");
		mResources.add(woSpace);
		
		for (RouteDescriber routeDescriber : list) {
			Resource resource = new Resource();
			resource.setM_id("req_"+getRandomHexString(32));
			resource.setMParentId(parent);
			resource.setMName("REQ_" + getRandomHexString(5));
			resource.setMUrl(routeDescriber.getMPaths().get(0));
			resource.setM_type("request");
			if(!routeDescriber.getMMethods().isEmpty()) {
				resource.setMMethod(routeDescriber.getMMethods().get(0));
			}
			
			
			mResources.add(resource);
		}
		
		objectMapper.writeValue(System.out,exportedInsomniaWorkSpace );
		
		
	}
	
	private static String getRandomHexString(int numchars){
		Random r = new Random();
		StringBuffer sb = new StringBuffer();
		while(sb.length() < numchars){
			sb.append(Integer.toHexString(r.nextInt()));
		}
		
		return sb.toString().substring(0, numchars);
	}
}
