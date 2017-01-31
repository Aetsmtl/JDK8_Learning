package com.aetsmtl.java8Learning.test;

import com.aetsmtl.java8Learning.demo.Foo;

public class Bar extends Foo{
	
	private int sum = 10;
	
	public static final boolean[] footer = new boolean[5];
	
	static{
		for (int i=0 ; i<5; i++){
			footer[i] = true;
		}
	}
	
	static{
		footer[1] = false;
		footer[4] = false;
	}
	
	public void reportSum(){
		
		// sum = sum + num; error cause by visibility of this field (to be set to protected)
		sum += result;
		
	}
	/*if you change visibility from pubic to private (less visible than his parent-class)
	 * (non-Javadoc)
	 * @see com.aetsmtl.java8Learning.demo.Foo#getDetail()
	 * You will get error.
	 */
	
	 
	@Override
	public String getDetail() {
		// TODO Auto-generated method stub
		return super.getDetail() + " And sum is " + sum;
	}
	
	

}
