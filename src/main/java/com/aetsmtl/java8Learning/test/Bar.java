package com.aetsmtl.java8Learning.test;

import com.aetsmtl.java8Learning.demo.Foo;

public class Bar extends Foo{
	
	private int sum = 10;
	
	public void reportSum(){
		
		// sum = sum + num; error cause by visibility of this field (to be set to protected)
		sum += result;
		
	}

}
