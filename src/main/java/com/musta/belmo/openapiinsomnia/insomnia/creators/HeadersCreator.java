package com.musta.belmo.openapiinsomnia.insomnia.creators;

import com.musta.belmo.openapiinsomnia.Util;
import com.musta.belmo.openapiinsomnia.insomnia.objects.Header;

import java.util.Collections;
import java.util.List;

public class HeadersCreator {
	public static final String PAIR_PREFIX = "pair_";
	
	public static List<Header> createHeaders() {
		final Header header = new Header();
		header.setName("Content-Type");
		header.setValue("application/json");
		header.setId(PAIR_PREFIX + Util.getRandomHexString32());
		return Collections.singletonList(header);
	}
}
