package org.abhi.hello.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class HelloWorld implements EntryPoint {

	@Override
	public void onModuleLoad() {
		Window.alert("Hello GWT");
		RootPanel.get("container").add(new HTML("<h1> content loaded from module file</h1>"));
		
	}
	
}
