package org.abhi.uibdemo.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class Login extends Composite {

	private static LoginUiBinder uiBinder = GWT.create(LoginUiBinder.class);

	interface LoginUiBinder extends UiBinder<Widget, Login> {
	}

	@UiField(provided = true)
	final LoginResources res;
	
	public Login() {
		this.res = GWT.create(LoginResources.class);
		res.css().ensureInjected();
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField
	TextBox loginBox;
	
	@UiField
	TextBox passwordBox;
	
	@UiField
	Label completionLabel1;
	
	@UiField
	Label completionLabel2;
	
	boolean loginSuccess = false;
	
	@UiHandler("buttonSubmit")
	void handleSubmit(ClickEvent event) {
		if(validate()) {
			Window.alert("Login success");
		}
	}

	@UiHandler("loginBox")
	void handleLoginNameChange(ValueChangeEvent<String> event) {
		if(event.getValue().length() < 6) {
			completionLabel1.setText("Login name short!!!");
		} else {
			completionLabel1.setText("");
		}
	}
	
	@UiHandler("passwordBox")
	void handlePasswordChange(ValueChangeEvent<String> event) {
		if(event.getValue().length() < 6) {
			completionLabel2.setText("Password short!!!");
		} else {
			completionLabel2.setText("");
		}
	}
	
	private boolean validate() {
		if(loginBox.getText().length() > 5 && passwordBox.getText().length()>5) {
			return true;
		}
		return false;
	}
	
	
	
}
