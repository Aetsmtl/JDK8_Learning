package com.aetsmtl.java8Learning.designPattern.singleton;

public class versionOneSingleton {
	
	private static final versionOneSingleton INSTANCE = new versionOneSingleton();
	
	private versionOneSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static versionOneSingleton getInstance(){
		return INSTANCE;
	}
}
