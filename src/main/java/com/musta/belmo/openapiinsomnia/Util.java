package com.musta.belmo.openapiinsomnia;

import java.util.Random;

public class Util {
	
	public static Random RANDOM;
	
	public static String createName(String mUrl, String method) { // refactor this
		String name = mUrl.substring(1).replace('/', '-');
		String adverb = "by";
		if (!method.equals("GET")) {
			adverb = "with";
		}
		name = name.replaceAll("(\\{\\w+})", adverb + " $0");
		name = String.format("[%s] %s", method, name);
		name = name.replaceAll("-$", "");
		name = name.replace("-", " ");
		
		return name;
	}
	
	public static String getRandomHexString(int numchars) {
		Random r = getRandom();
		final StringBuilder sb = new StringBuilder();
		while (sb.length() < numchars) {
			sb.append(Integer.toHexString(r.nextInt()));
		}
		return sb.toString().substring(0, numchars);
	}
	
	private static Random getRandom() {
		if(RANDOM == null){
			RANDOM = new Random();
		}
		return RANDOM;
	}
	
	public static String getRandomHexString32() {
		return getRandomHexString(32);
	}
	
	public static String createFolderName(String mUrl) {
		if (mUrl == null || mUrl.isEmpty())
			return "";
		final StringBuilder sb = new StringBuilder();
		 String substring = mUrl.substring(1);
		if(substring.startsWith("interne/")){
			substring = substring.replace("interne/","interne-");
		}
		for (int i = 0; i < substring.length(); i++) {
			char c = substring.charAt(i);
			if (c != '/') {
				sb.append(c);
			} else {
				break;
			}
		}
		return sb.toString();
	}
}
