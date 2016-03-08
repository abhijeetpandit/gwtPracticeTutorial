package org.abhi.rpcdemo.service;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface SayHelloServiceAsync {
	public void getHelloResponse(String name, AsyncCallback<String> callback);
}
