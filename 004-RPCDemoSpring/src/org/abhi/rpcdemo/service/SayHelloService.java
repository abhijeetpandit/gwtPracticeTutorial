package org.abhi.rpcdemo.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("hello")
public interface SayHelloService extends RemoteService {
	public String getHelloResponse(String name);
}
