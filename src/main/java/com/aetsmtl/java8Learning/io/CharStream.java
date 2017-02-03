package com.aetsmtl.java8Learning.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStream {
	
	public void testMethod (String[] s){
		
		char[] c  = new char[1];
		try {
			FileReader fr = new FileReader(s[2]);
			FileWriter fw = new FileWriter(s[3]);
			
			int count = 0;
			int read = 0;
			
			while((read = fr.read(c)) != -1){
				fw.write(c);
				fw.flush();
				count += read;
			}
			
			System.out.println("Wrote " + count +" Charactere");
					
		}catch(FileNotFoundException e){
			System.out.println("FIle : " + s[0] + " not found");
			System.out.println(e.getMessage());
		}catch (IOException e){
			System.out.println("IO Exception: " + e.getMessage());
		}
	}

}
