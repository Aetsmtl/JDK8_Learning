package com.aetsmtl.java8Learning;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	LocalDateTime whatTimeIsIt;
    	whatTimeIsIt = LocalDateTime.now();
    	
    	System.out.println("Without format "+whatTimeIsIt);
    	
    	String fWhatTimeIsIt = whatTimeIsIt.format(DateTimeFormatter.ISO_LOCAL_DATE);
    	System.out.println("With ISO_LOCAL_DATE format "+fWhatTimeIsIt);

    }

	private static void someManipulationSwitchternaryOperator() {
		//Differentes methods with the same name but differents signatures -> Overloading
    	System.out.println("La somme de 1 et 3 est : " + sum ( 1, 3));
    	System.out.println("La somme de 1.7 et 8 est : " + sum (1.7, 8));
    	System.out.println("La somme de 2 fois 55.5 est :" + sum (55.5F));
    	
    	int count = 0;
    	int[] datas = new int[10];
    	for (count=0 ; count < 10; count++){
    		int numberGenerated = (int)(Math.random()*5);
    		System.out.println("ex "+ count + " : " + numberGenerated);
    		datas[count] = numberGenerated;
    	}
    	
    	// ------> Ternary operator
    	
    	boolean beauty = false;
    	if (beauty){
        	System.out.println("this is a beautiful Guy :-)");
    	}
    	else{
        	System.out.println("This guy is no very beautiful xD");
    	}
    	
    	String s = (beauty = true) ? "this is a beautiful Guy :-)": "This guy is no very beautiful xD";
    	System.out.println(s);

    	// -------> Switch case
    	for (int i=0; i<10; i++){
    		
    		switch (datas[i]){
    		case 2 : 
    			//Actions
    			System.out.println("got 2"); 
    			break;
    		case 0 : System.out.println("got 0"); break;
    		case 3 : System.out.println("got 3"); break;
    		
    		default : System.out.println("Nothing got");
    		
    		}
    	
    	}
	}
    
    private static int sum (int a , int b){
    	return a + b;
    }

    private static double sum (double a, int b){
    	return a + b;
    }
    
    private static float sum (float a){
    	return a + a;
    }

	private static void simpleMethodManipulation() {
		
		/*Player Azamba = new Player();
    	System.out.println("Firstly I am " + Azamba.getName());
    	
    	if (Azamba.setName("Boris")){
    		System.out.println("Now my name is " + Azamba.getName());
    	}
    	else{
    		if(Azamba.setName("Aurel")){
        		System.out.println("I am retrying to change my name to " + Azamba.getName());
    		}
    	}
    	System.out.println("Finally, my name is " + Azamba.getName());*/
	}

	private static void basicDataTypeManipulation() {
		int firstCounter = 2;
    	int secondCounter = 7;
    	
    	System.out.println("\n --- Incrementation --- \n");

    	int newPostCounter = firstCounter++;
    	System.out.println("PostIncrementation : " + newPostCounter);
    	int  newPreCounter = --secondCounter;
    	System.out.println("PreIncrementation : " + newPreCounter);
    	
    	System.out.println("\n --- Promotion and Casting concept --- \n");
    	int alpha = 7;
    	int beta = 3;
    	double teta = alpha/beta;
    	System.out.println("int 7 / int 3 -> wrong promotion : " + teta + "you should declare at least one "
    			+ "of beta or alpha as double to have correct answer\n"
    			+ "The effect will be same if you did int 3333 * int 5555 = double teta"
    			+ "because the multipication will be -456789... ");
    	
  
    	System.out.println("\n --- manipulation  --- \n");
    	
    	int intOne;
    	long longOne = 88000000000L;
    	float floatOne = 34.3F;
    	char chOne = 'c';
    	
    	System.out.println("printing long Value : " +longOne);
    	intOne = (int)longOne;
    	System.out.println("Long value assigned to int : " +intOne +" <-");
    	
    	System.out.println("\n --- Reg expression  --- \n");

    	String[] listOfName = {"Pierre Marie", "Jack Bauer", "Stephen Harper", "Barrack Obama"};
    	
    	for(String s : listOfName){
    		if (s.matches(".*rr.*")){
    			System.out.println(s);
    			System.out.println("First name : " + s.split(" ")[0]);
    		}
    	}
	}

	private static void basicStringManipulation() {
		String stringOne = "Hello world";
		   String stringTwo = new String(" HEY ");
		   stringOne = stringOne.concat(" plus concat with space ");
		   System.out.println(stringOne);
		   
		   stringOne = stringTwo + stringOne;
		   System.out.println("Print without trim : " +stringOne);
		   
		   stringOne = (stringTwo + stringOne).trim();
		   System.out.println("Print after trim : " +stringOne);
		   
		   stringOne = ("Print in upper case : " +stringOne.toUpperCase());
		   System.out.println(stringOne);    
		   
		   System.out.println("\n------ ----- ------\n");    

		   String brandonName = "Brandon Sardou";
		   int spaceIndex = brandonName.indexOf(" ");
		   
		   String brandonFirstName = brandonName.substring(0, spaceIndex);
		   System.out.println("His first name is : " + brandonFirstName); 
		   
		   System.out.println("\n------ ------ Little manipuation of string Builder -----\n");
		   
		   StringBuilder sb;
		   sb = new StringBuilder(stringOne);
		   System.out.println(sb);
		   sb.delete(0, sb.length() - 6);
		   System.out.println(sb);
		   sb.append(" ++ I have just appended this part of string");
		   System.out.println(sb);
	}

	private static void basicTest() {
		String customerName = "Mike";
        String clientName = "Odilya";
        String message;
        
        double priceCup = 12.4;
        double priceScreen = 67.2;
        double total;
        
        boolean isTakeCB;
        
        String[] items = {"car","screen","phone", "book","mouse", "cup"};
        
        message = customerName + ": Hallo " + clientName;
        int numberOfItemsInSelling = items.length;
        
        total = priceCup*3 + priceScreen*5;
 
        System.out.println(message);
        System.out.println(customerName +": We have " +numberOfItemsInSelling +" items in stock " );
        for (String item : items){
            System.out.print(item +" - ");
        }
       
        System.out.println("\n"+ customerName + " : Your bill is " + total);
        
        if (total > 5000){
            System.out.println(clientName + ": " + total + "€! " + "its enought for me ");
        }
        else{
            System.out.println(clientName +": ok Do you take CB?" );
            isTakeCB = false;
            if (isTakeCB){
            	System.out.println(customerName +": Of course yes!" );
            	System.out.println(clientName +": Oh yes!" );
            }
            {
            	System.out.println(customerName +": No, Sorry" );
            	System.out.println(clientName +": Damn!... oops Sorry :) Could you please remove some items?");
            }
        }
	}
}
