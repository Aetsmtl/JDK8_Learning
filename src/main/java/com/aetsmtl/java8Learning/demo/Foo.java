package com.aetsmtl.java8Learning.demo;

public class Foo {
	
	protected int result = 25;
	int num = 20;
	
	public String getDetail(){
		return ("result is : " + result + " And num is : " + num);
	}
	
	public String getState(PowerState pS){
		
		if (pS.equals(PowerState.ON)){
			return "The System is ON";
		}
		else{
			return "The System is not ON";
		}
	}
}
