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
        
        message = customerName + " says Hallo to " + clientName;
        
        double priceCup = 12.4;
        double priceScreen = 67.2;
        double total;
        
        total = priceCup*3 + priceScreen*5;
 
        System.out.println(message);
        System.out.println(customerName + " : Your bill is " + total);
        
        if (total > 50){
            System.out.println(clientName + ": " + total + "€! " + "its enought for me ");
        }
        else{
            System.out.println(clientName +": ok Do you take CB?" );
        }
        
    }
}
