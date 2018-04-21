
public class ControlFlowOperators {

	public static void main(String[] args) {

		// if else, switch, ? : (conditional or ternary operator)
		// repetition: while, do-while, for, enhanced for loop
		int a = 10, b = 6, c;

		//enhanced for loop
		int[] array = {10,20,30,40,50};
		
		for(int element : array){
			System.out.println(element);
		}
		
		//while loop
		while (a > b) {
			System.out.println(b);
			b++;
		}

		//do while loop
		do {
			System.out.println(b);
			b++;
		} while (a > b);

		//for loop
		for (int i = 0; i < 10; i++){
			
			if (i == 5){
				continue;
			}
			System.out.println(i);
		}
		
		
		 c = a > b ? 23 : a / b;
		
		 System.out.println( a > b ? 5 : 34.78);
		
		 if (a > b) {
		 a = 10;
		 } else {
		 b = a / b;
		 c = b + a;
		 }
		
		 // Java 7 and above can switch on a string
		 switch ("Colin") {
		
		 case "Bob":
		 System.out.println("Bob");
		 break;
		 case "Colin":
		 System.out.println("Colin");
		 }
		
		 // Can switch on byte, short, int, or char
		 switch (a % 2) {
		
		 case 0:
		 System.out.println("it's a 0");
		 break;
		 case 1:
		 System.out.println("it's a 1");
		 break;
		 default:
		 System.out.println("Not 1 or 2");
		 break;
		 }

	}

}
