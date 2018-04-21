
public class EightsIn365 {

	public static void main(String[] args) {

		int myNumber, firstFour = 0, lastFour = 0;

		//Gives us the first possible number divisible
		//by 365 that will result in an 8 digit number
		
		myNumber = (10000000 / 365) + 1;

		//Store the number for match checking
		//of first and last 4 digits
		
		int result = myNumber * 365;

		System.out.println("My Number \t Result");

		//Loop across results less than 9 digits
		//to find results where the first 4 and last 4 match
		
		while (result < 100000000) {
			firstFour = result / 10000;
			lastFour = result % 10000;

			//Print the match number found as well as the resulting match
			
			if (firstFour == lastFour) {
				System.out.println(myNumber + "\t\t" + result);
			}

			//Iterate the number by 1 and the result by 365
			//to get proper multiples
			myNumber++;
			result += 365;
		}
	}
}
