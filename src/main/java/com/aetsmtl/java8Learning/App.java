package com.aetsmtl.java8Learning;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String customerName = "Mike";
        String clientName = "Odilya";
        String message;
        
        double priceCup = 12.4;
        double priceScreen = 67.2;
        double total;
        
        boolean isTakeCB;
        
        message = customerName + " says Hallo to " + clientName;
        
        total = priceCup*3 + priceScreen*5;
 
        System.out.println(message);
        System.out.println(customerName + " : Your bill is " + total);
        
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
            	System.out.println(clientName +": Damn!... oops Sorry could you please remove some items?");
            }
        }
        
    }
}
