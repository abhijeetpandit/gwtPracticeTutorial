package org.abhi.uibdemo.client;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;

public interface LoginResources extends ClientBundle {
	public interface MyCss extends CssResource {
		@ClassName("black-text")
		String blackText();
		
		@ClassName("red-text")
		String redText();
		
		@ClassName("login-button")
		String loginButton();
		
		String box();
		String background();
		
		@ClassName("text-field")
		String textField();
	}
	
	@Source("Login.css")
	MyCss css();
}
