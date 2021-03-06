package com.aetsmtl.java8Learning;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.Deque;
import java.util.ArrayDeque;
import java.lang.Math;

import com.aetsmtl.java8Learning.demo.Foo;
import com.aetsmtl.java8Learning.demo.PowerState;
import com.aetsmtl.java8Learning.exceptionHandling.Calculator;
import com.aetsmtl.java8Learning.inheritance.Peugeot;
import com.aetsmtl.java8Learning.inheritance.Porshe;
import com.aetsmtl.java8Learning.inheritance.Vehicule;
import com.aetsmtl.java8Learning.io.CharStream;
import com.aetsmtl.java8Learning.io.KeyboardInput;
import com.aetsmtl.java8Learning.stream.Person;
import com.aetsmtl.java8Learning.test.Bar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// -- enums
    	Foo firstFoo = new Foo();
    	
    	System.out.println(firstFoo.getState(PowerState.OFF));
    	System.out.println(firstFoo.getState(PowerState.ON));
    	
    	System.out.println("");
    	System.out.println("");
    	
    	System.out.println((new Foo()).getDetail());
    	System.out.println((new Bar()).getDetail());
    	
    	System.out.println("");
    	System.out.println("");
    	
    	//Using Static keyword
    	
    	System.out.println("");
    	System.out.println("");
    	Bar b = new Bar();
    	
    	for (int i=0; i<5; i++){
    		if (b.footer[i]){
    			System.out.println("1");
    		}
    		else {
    			System.out.println("0");
    		}
    	}
    
    	
    
    	simpleInheritanceCase();
    	System.out.println("");
    	System.out.println("");
    	usingArrayList();
    	System.out.println("");
    	System.out.println("");
    	simpleUsingExceptionLambdaExpressionEtc();
    	System.out.println("");
    	System.out.println("");
    	basicDataTypeManipulation();
    	System.out.println("");
    	System.out.println("");
    	basicStringManipulation();
    	System.out.println("");
    	System.out.println("");
    	basicMethodForDateLoopManipulation(args);
    	System.out.println("");
    	System.out.println("");
    	basicTest();
    	System.out.println("");
    	System.out.println("");
    	someManipulationSwitchternaryOperator();
    	System.out.println("");
    	System.out.println("");
    	System.out.println("");
    	System.out.println("");
    	sum(9);
    	sum(78, 2);
    	System.out.println("");
    	System.out.println("");
    	simpleMethodManipulation();
    	System.out.println("");
    	System.out.println("");
    	
    	// Using Set with treeSet
    	Set<String> mySet = new TreeSet<>();
    	mySet.add("One");
    	mySet.add("Two");
    	mySet.add("Three");
    	//mySet.add(null);
    	mySet.add("Three");
    	
    	for (String s : mySet){
    		System.out.println("item : " + s);
    	}	
    	
    	
    	// Using Map with treeMap
    	Map<String, String> myMap = new TreeMap<>();
    	myMap.put("s001", "AShlumberger");
    	myMap.put("s002", "Phone6S");
    	myMap.put("h001", "ZoneDeRap");
    	
    	myMap.put("s002", "Nokia-XP");
    	
    	Set<String> myKey = myMap.keySet();
    	
    	for (String s : myKey){
    		System.out.println("Key : " + s + " value : " + myMap.get(s));
    	}
    	
    	// -- Using Deque
    	Deque<String> myDeque = new ArrayDeque<>();
    	myDeque.push("firstElement");
    	myDeque.push("secondElement");
    	myDeque.push("thirthElement");
    	myDeque.push("fourthElement");
    	
    	int size = myDeque.size();
    	while (size > 0){
    		System.out.println("Item : " + myDeque.pop());
    		size--;
    	}
    	
    	// -- Using Stream and lambda Expression
    	Person personOne = new Person("Mathias", "Paris", "6 rue Fevre", 9);
    	Person personTwo = new Person("Zaïda", "Madrid", "76 rue efscq", 3);
    	Person personThree = new Person("Adam", "Paris", "7 rue Foll", 17);
    	Person personFour = new Person("Abdel", "Bruxelle", "59 rue Gloria", 5);
    	Person personFith = new Person("Roger", "Paris", "76 rue richFoll", 1);
    	Person personSixth = new Person("Mom", "Bruxelle", "5 rue Halljkqnfjk", 12);
    	
    	List<Person> lPerson = new ArrayList<Person>();
    	lPerson.add(personFour); lPerson.add(personTwo); lPerson.add(personSixth); 
    	lPerson.add(personOne); lPerson.add(personThree); lPerson.add(personFith); 
    	
    	lPerson.stream()
    	.filter(p -> p.getSurname().equals("Paris"))
    	.filter(p -> p.getAge() > 10)
    	//.forEach(p -> p.setAge(0))
    	.forEach(p -> System.out.print("\n" + p.getNom().toUpperCase()+"\n"));
    	//.forEach(p -> Math::pow(p.getAge)));
    	
    	System.out.println(lPerson);
    	
    	// Using Predicate with Stream and ForEach
    	Predicate<Person> bruxPerson = (p -> p.getSurname().equals("Bruxelle"));
    	
    	System.out.println("predicate used with ForEach loop");
    	for (Person p : lPerson){
    		if (bruxPerson.test(p)){
    			System.out.println(p);
    		}
    	}
    	
    	System.out.println("predicate used with Stream");
    	lPerson.stream()
    	.filter(bruxPerson)
    	.forEach(p -> System.out.println(p));

    	Consumer<Person> adressConsumer = (p -> System.out.println("Adress : "+ p.getAddress()));
    	
    	System.out.println("Consumer used with ForEach loop");
    	for (Person p : lPerson){
    		adressConsumer.accept(p);
    	}
    	
    	System.out.println("Consumer used with Stream");
    	lPerson.stream()
    	.forEach(adressConsumer);
    	
    	
    	// IO 
    	System.out.println(" ");
    	CharStream cs = new CharStream();
    	//cs.testMethod(args);
    	
    	// first version BufferedReader io
    	System.out.println(" ");
    	KeyboardInput ki = new KeyboardInput();
    	ki.testMethod();
    	
    	ki.testMethodWithChannel();
    	
    	
    	
    }

	private static void simpleUsingExceptionLambdaExpressionEtc() {
		// Initializing Data
    	List<Vehicule> vehicule = new ArrayList<Vehicule>();
    	Porshe pOne = new Porshe("PorsheX","green", "volvo23", "Boris");
    	Peugeot pTwo = new Peugeot("greenE", "volvo23", "Arnold");
    	Porshe pThree = new Porshe("PorsheZ","Red", "volvo23", "Patrick");
    	Peugeot pFour = new Peugeot("greenA", "volvo23", "Roger");
    	
    	vehicule.add(pOne);
    	vehicule.add(pTwo);
    	vehicule.add(pThree);
    	vehicule.add(pFour);
    	
    	// using predication (Lambda)
    	System.out.println ("before appliction of filter \n" + vehicule );
    	vehicule.removeIf(f -> f instanceof Peugeot);
    	System.out.println ("\n\n\nAfter appliction of filter \n" + vehicule );
    	
    	// using functionnal interface and lambda expression
    	
    	// Example of using List, ArrayList, which extend AbstractArrayList and implement a lot of interface
        String[] weekDayArray = {" monday ", " tuesday "," wednesday "," thursday "," friday "," saturday "," sunday "};
    	
    	ArrayList<String> weekDayList = new ArrayList<String>(Arrays.asList(weekDayArray));
    	
    	for (String s : weekDayList){
    		if (s.trim().equals("sunday")){
    			System.out.println("\n"+ s.toUpperCase());	
    		}
    		else {
    			System.out.print("\n" + s);	
    		}
    	}
    	
    	// Excetion Handling and Catching
    	Calculator calculatorDiv = new Calculator(78, 0);
    	try {
        	System.out.println(calculatorDiv.divide());
    		System.out.println("Calculation successful");
    	}
    	catch(ArithmeticException aE){
    		System.out.println("Error was found in : " + aE.getMessage());
    	}
	}

	private static void simpleInheritanceCase() {
		Vehicule porsheOne = new Porshe("Carrera", "rouge", "16 Valves", "Gyovanni");
    	porsheOne.accelerate();
    	
    	// ---- Same name of method differents results
    	Vehicule peugeotOne = new Peugeot("gris", "3 Valves", "Dominique Du Penis");
    	peugeotOne.accelerate();
    	
    	// ---- Test of instance of
    	List<Vehicule> parc = new ArrayList<Vehicule>();
    	parc.add(porsheOne);
    	parc.add(peugeotOne);
    	
    	for (Vehicule v : parc){
    		
    		char c = (v instanceof Peugeot) ? 'P' : 'V'; 
        	switch (c){
        	case 'P' : 
        		System.out.println("On a une instance de peugeot"); 
        		Peugeot p = (Peugeot)v; 
        		p.vidange();
        		break;
        	default :
        		System.out.println ("Une occurence d'autre chose");
        		
        	}
    	}
	}

	private static void usingArrayList() {
		ArrayList<String> item = new ArrayList<String>();
    	item.add("Chocolate");
    	item.add("Cacaouette");
    	item.add("Coke");
    	System.out.println(item);
    	
    	item.add(2, "Cash");
    	System.out.println(item);
    	
    	item.remove(1);
    	System.out.println(item);
	}

	private static void basicMethodForDateLoopManipulation(String[] args) {
		LocalDateTime whatTimeIsIt;
    	whatTimeIsIt = LocalDateTime.now();
    	
    	System.out.println("Without format "+whatTimeIsIt);
    	
    	String fWhatTimeIsIt = whatTimeIsIt.format(DateTimeFormatter.ISO_LOCAL_DATE);
    	System.out.println("With ISO_LOCAL_DATE format "+fWhatTimeIsIt);
    	
    	
    	// --------------- utilization of Args Array ---------------
    	if (args.length != 2){
    		System.out.println("you should put exactly two argument to the program");
    	}
    	else
    	{
    		int firstArg = Integer.parseInt(args[0]);
    		int secondArg = Integer.parseInt(args[1]);
    		secondArg+= firstArg;

    		System.out.println("The concat of two arguments is : " + firstArg + secondArg);
    		System.out.println("The concat of two arguments is : " + secondArg) ;

    	}
    	
    	// ---------------- While loop and Continue
    	int[][] names = new int[5][7];
    	for (int longr = 0; longr <5; longr++){
    		for (int larg = 0; larg <7; larg++){
        		names[longr][larg] = (int)(Math.random()*6 + 1);
        	}
    	}
    	
    	int descOne = 5;
    	int descTwo = 7;
    	while (descOne-- > 0){
    		while(descTwo-- > 0){
    			if (names[descOne][descTwo] > 3)
    				System.out.print(" " + names[descOne][descTwo] +" ");
    			else
        			System.out.print(" - ");
    		}
    		descTwo = 7;
    		System.out.println(" | ");
    	}
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
    	// float floatOne = 34.3F;
    	// char chOne = 'c';
    	
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
