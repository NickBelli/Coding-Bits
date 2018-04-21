
public class RaggedArrays {

	public static void main(String[] args) {
		int odds;

		int[][] table1 = { 
				{ 13, 12, 53, 19 }, 
				{ 1, 9, 6, 25, 18, 17 }, 
				{ 7, 28, 4 } 
				};

		int[][] table2 = { 
				{ 13, 13, -85 }, 
				{ 11, 19 }, 
				{ 31, -89, 47, 26, +895 } 
				};
		
		int[][] table3 = { 
				{ 10, 13, 42 }, 
				{ 69, -181 }, 
				{ 20, -365, 0, 1, +895 } 
				};

		odds = countOdds(table1);
		System.out.println("There are " + odds + " odd numbers in Table 1");
		
		odds = countOdds(table2);
		System.out.println("There are " + odds + " odd numbers in Table 2");
		
		odds = countOdds(table3);
		System.out.println("There are " + odds + " odd numbers in Table 3");

	}

	public static int countOdds(int[][] table){
		int odds = 0, myPositiveInt = 0;
		for (int row = 0; row < table.length; row++) {
			for (int column = 0; column < table[row].length; column++) {
				if (table[row][column] < 0) {
					myPositiveInt = table[row][column] * -1;
				} else {
					myPositiveInt = table[row][column];
				}

				if (myPositiveInt % 2 == 1) {
					odds++;
				}
			}
		}
		return odds;
	}
}
