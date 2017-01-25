package com.aetsmtl.java8Learning;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
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
