package Exception4_10;

public class ArrayException {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };
		try {
			System.out.println(arr[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: The actual size of array is 5.. give the index properly...");
			System.out.println("Size "+ arr.length);
		}

	}

}
