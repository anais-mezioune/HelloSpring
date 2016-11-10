package com.m2i.spring;

public class HelloM2i {
	
	private String message;
	
	public void setMessage(String message){
		this.message = message;
	}
	
	public void getMessage(){
		System.out.println("Message : " + message);
	}
}
