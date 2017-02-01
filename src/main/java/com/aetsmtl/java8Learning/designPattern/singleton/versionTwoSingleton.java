package com.aetsmtl.java8Learning.designPattern.singleton;

public class versionTwoSingleton {
	
	private static volatile versionTwoSingleton INSTANCE = null;
	
	private versionTwoSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static versionTwoSingleton getInstance(){
		if (INSTANCE == null){
			synchronized(versionOneSingleton.class){
				if (INSTANCE == null){
					INSTANCE = new versionTwoSingleton();
				}
			}
			
		}
		return INSTANCE;
	}
}

