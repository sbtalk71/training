package exceptions;

public class CalMain {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		try {
		System.out.println(cal.divide(6, 0));
		}catch(IllegalArgumentException e) {
			e.printStackTrace();
		}

	}

}
