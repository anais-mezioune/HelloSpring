package com.m2i.spring;

public class HelloWorld {
	private String message1;
	private String message2;
	
	public void setMessage1(String message){
		this.message1 = message;
	}
	
	public void getMessage1(){
		System.out.println("Message1 : " + message1);
	}
	
	public void setMessage2(String message){
		this.message2 = message;
	}
	
	public void getMessage2(){
		System.out.println("Message2 : " + message2);
	}
}
