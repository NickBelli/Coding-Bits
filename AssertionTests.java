
public class AssertionTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			assertionTest(-2);
		}catch (AssertionError ae){
			System.out.println(ae.getMessage());
		}
	}

	private static void assertionTest(int myNumber){
		assert myNumber >= 0 : "My number is negative: " + myNumber; 
	}
}
