package org.abhi.cssdemo.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class _02_CSSDemo implements EntryPoint {

	@Override
	public void onModuleLoad() {
		final Button button1 = new Button("Big Text");
		button1.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				RootPanel.get("myText").setStyleName("gwt-Big-Text");
			}
		});
		
		final Button button2 = new Button("Small Text");
		button2.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				RootPanel.get("myText").setStyleName("gwt-Small-Text");
			}
		});
		
		RootPanel.get("greenButton").add(button1);
		RootPanel.get("redButton").add(button2);
	}
	
}
