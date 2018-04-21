import java.util.Random;

public class ExceptionsTests {

	public static void main(String[] args) {

		Random r = new Random();
		int[] array = { 10, 20 };
		try {

			int arrayIndex = r.nextInt(array.length + 1);
			int divideBy = r.nextInt(2);

			System.out.println("My array index is: " + arrayIndex);
			System.out.println("I divide by: " + divideBy);

			int result = array[arrayIndex] / divideBy;
			System.out.println("Success! My result is: " + result);
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("Where did it go?");
		} catch (ArithmeticException ae) {
			System.out.println("You can't divide by zero!");
		}
	}

}
