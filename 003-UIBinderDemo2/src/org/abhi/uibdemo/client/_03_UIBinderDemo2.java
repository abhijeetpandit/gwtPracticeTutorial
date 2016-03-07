package org.abhi.uibdemo.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class _03_UIBinderDemo2 implements EntryPoint {

	@Override
	public void onModuleLoad() {
		RootPanel.get().add(new Login());
	}
	
}
