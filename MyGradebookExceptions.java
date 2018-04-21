
public class MyGradebookExceptions {

	public static void main(String[] args) {

		int[] grades = { 50, 100, 100, 50, 100, 100, 50, 75, 75, 80, 20 };

		System.out.println("The original grades are: ");
		for(int grade: grades){
			 System.out.print(grade + "\t");
		}
		
		try {
			System.out.println("\n\nThe final average is: " + average(grades));
		} catch (InvalidGradeException ige) {
			System.out.println("\n\n" + ige.getMessage());
		}
		
		System.out.println("\nThe final grades are: ");
		for(int grade: grades){
			 System.out.print(grade + "\t");
		}
		
	}

	public static int average(int[] grades) throws InvalidGradeException {
		int sum = 0;
		int average = 0;

		for (int i = 0; i < grades.length; i++) {
			try {
				if (grades[i] < 0 || grades[i] > 100) {
					throw new InvalidGradeException(
							"Grade at row: " + (i + 1) + " is invalid with a value of: " + grades[i]);
				} else {
					sum += grades[i];
					average = sum / grades.length;
				}

			} finally {

				if (grades[i] < 60 && grades[i] > 0) {
					grades[i] = 60;
				}

			}

		}
		return average;
	}
}