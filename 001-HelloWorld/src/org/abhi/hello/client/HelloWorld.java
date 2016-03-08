package org.abhi.hello.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class HelloWorld implements EntryPoint, AsyncCallback<String> {
	GreetingServiceAsync service = GWT.create(GreetingService.class);
	
	@Override
	public void onModuleLoad() {
		RootPanel.get("container").add(new HTML("<h1> content loaded from module file</h1>"));
		service.greetServer("abc", this);
	}

	@Override
	public void onFailure(Throwable caught) {
		Window.alert(caught.getMessage());
	}

	@Override
	public void onSuccess(String result) {
		Window.alert(result);
	}
	
}
