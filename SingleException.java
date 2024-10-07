package Exception4_10;

import java.util.Scanner;

public class SingleException {

	public static double divide(int num1, int num2) {
		return num1 / num2;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Emter two number");

			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			double result = divide(num1, num2);
			System.out.println("Result is: " + result);
		} catch (ArithmeticException e) {

			// preferred 1 2 3 condition
			System.out.println("We can not divide number by 0.."); // 1st
			System.out.println(e.getMessage()); // 2nd
			e.printStackTrace(); // 3rd
			System.out.println(e); // 4th

		}
	}
}
