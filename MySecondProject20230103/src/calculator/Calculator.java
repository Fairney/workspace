package calculator;

public class Calculator {

	public double add(double a, double b) {
		return a+b;
	}
	
	public double substract(double a, double b) {
		return a-b;
	}
	
	public double multiply(double a, double b) {
		return a*b;
	}
	public double mod(double a, double b) {
		return a%b;
	}
	public double abs(double a)
	{
		return (a>0)?a:-a;
	}
	
}
