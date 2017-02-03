package com.aetsmtl.java8Learning.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class KeyboardInput {

	public void testMethod(){
		try{
			InputStreamReader isR = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isR);
			
			String s = "";
			
			s = br.readLine();
			while (s != null ){
				System.out.println(s);
				if (s.trim().equals("xyz")){
					break;//System.exit(0);
				}
				System.out.println("write xyz to stop application :-)");
				s = br.readLine();
			}
		}catch(Exception e){
			System.out.print(e.getMessage());
		}
	}
	
	public void testMethodWithChannel(){
		try {
			FileInputStream fileInputStream = new FileInputStream("input");
			FileOutputStream fileOutputStream = new FileOutputStream("output");
			
			FileChannel fchIn = fileInputStream.getChannel();
			FileChannel fchOut = fileOutputStream.getChannel();
			
			ByteBuffer bBuff = ByteBuffer.allocate((int)fchIn.size());
			
			System.out.println("Starting Reading");
			fchIn.read(bBuff);
			bBuff.position(0);
			System.out.println("Starting Writing");
			fchOut.write(bBuff);
			
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		
	}
}
