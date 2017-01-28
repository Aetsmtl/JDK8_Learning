package exceptionHandling;

public class Calculator {

	double firstParameter;
	double secontParameter;
	
	public Calculator(double a, double b) {
		// TODO Auto-generated constructor stub
		this.firstParameter = a;
		this.secontParameter = b;
	}
	
	public int divide (){
		return (int)firstParameter/(int)secontParameter;
	}
	
}
