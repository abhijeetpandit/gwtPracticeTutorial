package org.abhi.rpcdemo.client.hello;

import org.abhi.rpcdemo.service.SayHelloService;
import org.abhi.rpcdemo.service.SayHelloServiceAsync;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class Hello extends Composite implements AsyncCallback<String> {

	private static HelloUiBinder uiBinder = GWT.create(HelloUiBinder.class);

	private static SayHelloServiceAsync helloService = GWT.create(SayHelloService.class);
	
	interface HelloUiBinder extends UiBinder<Widget, Hello> {
	}

	@UiField
	TextBox textBox;
	
	@UiField
	Button button;
	
	public Hello() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@UiHandler("button")
	public void onClick(ClickEvent event) {
		helloService.getHelloResponse(textBox.getText(), this);
	}

	@Override
	public void onFailure(Throwable caught) {
		Window.alert("Error:" + caught.getMessage());
	}

	@Override
	public void onSuccess(String result) {
		Window.alert(result);
	}
}
