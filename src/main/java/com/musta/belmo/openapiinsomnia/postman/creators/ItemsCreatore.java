package com.musta.belmo.openapiinsomnia.postman.creators;

import com.musta.belmo.openapiinsomnia.Util;
import com.musta.belmo.openapiinsomnia.postman.objects.Item;
import com.musta.belmo.openapiinsomnia.postman.objects.Postman;
import com.musta.belmo.openapiinsomnia.postman.objects.ProtocolProfileBehavior;
import com.musta.belmo.openapiinsomnia.routes.objects.RouteDescriber;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ItemsCreatore {
	public static void createItems(Postman postman, List<RouteDescriber> describers) {
		ArrayList<Item> items = new ArrayList<>();
		for (RouteDescriber describer : describers) {
			Item anItem = new Item();
			anItem.setName(Util.createName(describer.getPaths().get(0), describer.getMethods().get(0)));
			anItem.setProtocolProfileBehavior(new ProtocolProfileBehavior());
			RequestCreators.setRequest(anItem, describer);
			anItem.setResponse(new ArrayList<>());
			items.add(anItem);
		}
		ArrayList<Item> groupedItems = new ArrayList<>();
		
		final Map<String, List<Item>> map = items.stream()
				.filter(res -> res.getFolder() != null)
				.sorted(Comparator.comparing(Item::getFolder))
				.collect(Collectors.groupingBy(Item::getFolder));
		map.entrySet().stream()
				.sorted(Map.Entry.comparingByKey())
				.forEach(entry -> {
					String folder = entry.getKey();
					List<Item> item = entry.getValue();
					Item folderItem = new Item();
					folderItem.setProtocolProfileBehavior(new ProtocolProfileBehavior());
					folderItem.setName(folder);
					folderItem.setSubItems(item);
					groupedItems.add(folderItem);
				});
		
		postman.setItem(groupedItems);
	}
}
