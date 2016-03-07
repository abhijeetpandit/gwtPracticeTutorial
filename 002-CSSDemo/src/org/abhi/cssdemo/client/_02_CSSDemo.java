package org.abhi.cssdemo.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
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
		
		Label blueLabel = new Label("Blue Label");
		blueLabel.setStylePrimaryName("blue-text");
		Label blueBoldLabel = new Label("Blue Bold Label");
		blueBoldLabel.setStylePrimaryName("blue-text");
		blueBoldLabel.addStyleName("bold-text");
		RootPanel panel = RootPanel.get("labelsTest");
		panel.add(blueLabel);
		panel.add(blueBoldLabel);
	
	
		RootPanel labelsPanel = RootPanel.get("labels-test2");
		
		Label label1 = new Label("First Label");
		Label label2 = new Label("Second Label");
		
		label1.setTitle("title1(tooltip1)");
		label2.setTitle("title2(tooltip2)");
		label1.setStyleName("style1");
		label2.setStyleName("style2");
		
		labelsPanel.add(label1);
		labelsPanel.add(label2);
		
		HTML html1 = new HTML("HTML text1");
		HTML html2 = new HTML("HTML text1");
		
		html1.setStyleName("style1");
		html2.setStyleName("style2");
		
		RootPanel.get("html-test").add(html1);
		RootPanel.get("html-test").add(html2);
		
		Anchor anchor = new Anchor("Dashboard", false, "http://www.google.co.in", "_blank");
		RootPanel.get("html-test").add(anchor);
	}
}
