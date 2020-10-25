package com.musta.belmo.openapiinsomnia.insomnia.creators;

import com.musta.belmo.openapiinsomnia.insomnia.objects.Resource;

public class WorkspaceCreator {
	public static Resource createWorkSpace(String parent) {
		final Resource woSpace = new Resource();
		woSpace.setId(parent);
		woSpace.setType("workspace");
		woSpace.setName("NEW");
		return woSpace;
	}
}
