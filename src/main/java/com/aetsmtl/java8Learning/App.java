package com.aetsmtl.java8Learning;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
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
