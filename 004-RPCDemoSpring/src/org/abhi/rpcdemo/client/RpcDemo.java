package org.abhi.rpcdemo.client;

import org.abhi.rpcdemo.client.hello.Hello;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootPanel;

public class RpcDemo implements EntryPoint {

	@Override
	public void onModuleLoad() {
		RootPanel.get().add(new Hello());
	}

}
