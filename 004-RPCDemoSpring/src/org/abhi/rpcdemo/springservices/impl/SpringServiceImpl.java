package org.abhi.rpcdemo.springservices.impl;

import org.abhi.rpcdemo.springservices.SpringService;

public class SpringServiceImpl implements SpringService {

	@Override
	public String springHello(String string) {
		return "Hello " + string + " from spring service";
	}

}
