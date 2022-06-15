package exceptions;

public class Calculator {

	public double divide(int a, int b) {
		try {
			return a / b;
		} catch (ArithmeticException e) {
			System.out.println(e);
			throw new IllegalArgumentException(e);
		}
		
	}
}
