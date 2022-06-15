package exceptions;

public class ExceptionsDemo1 {

	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 10;
			double result = a / b;
			int[] nums = new int[3];
			System.out.println(nums[2]);
			/*
			 * String[] names = new String[2]; System.out.println(names[1].length());
			 */

			System.out.println("No Exceptions here");
		} catch (ArithmeticException ex) {
			ex.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally executes always...");
		}

		System.out.println("Normal flow resumed...");

	}

}
