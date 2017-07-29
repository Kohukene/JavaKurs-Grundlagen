package com.t_systems_mms.basics;

public class EchoErbe extends Echo{
	
	@Override
	public String getMessage(){
		return "Hello " + getRecipient();
	}


} 