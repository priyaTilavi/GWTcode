package com.app.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class EntryClass implements EntryPoint {

	private Label msg= new Label ("Hello Priya");
	
	@Override
	public void onModuleLoad() {
		// TODO Auto-generated method stub
		RootPanel.get().add(msg);

	}

}
