package org.abhi.rpcdemo.serviceimpl;

import org.abhi.rpcdemo.service.SayHelloService;
import org.abhi.rpcdemo.springservices.SpringService;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class HelloServiceImpl extends RemoteServiceServlet implements SayHelloService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SpringService springService;
	
	public HelloServiceImpl() {
		System.out.println("--------------------->called");
	}

	@Override
	public String getHelloResponse(String name) {
		return "Hi " + name + "spring->" + springService.springHello(name);
	}

	public void setSpringService(SpringService springService) {
		this.springService = springService;
	}

}
