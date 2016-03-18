package org.abhi.app5.client;

import org.abhi.app5.client.widgets.MyWidget;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class Demo implements EntryPoint {

	@Override
	public void onModuleLoad() {
		MyWidget myWidget = new MyWidget();
		RootPanel.get().add(myWidget);
	}

}
