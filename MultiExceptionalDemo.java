package Exception4_10;

import java.util.Scanner;

public class MultiExceptionalDemo {
	public static double divide(int num1, int num2) {
		return num1 / num2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		String str = sc.next();
		String str1 = sc.next();

		try {
			int num1 = Integer.parseInt(str);
			int num2 = Integer.parseInt(str1);

			double result = divide(num1, num2);
			System.out.println("Result is: " + result);

		} catch (ArithmeticException e) {
			System.out.println("We can not divide number by 0..");
		} catch (NumberFormatException e1) {
			System.out.println("The value expected to be numbers not character..");
		} catch (Exception e) {
			// generalized exception
			System.out.println("Error: There is an error..");
		} finally {
			System.out.println("This is final block..");
		}
	}

}
