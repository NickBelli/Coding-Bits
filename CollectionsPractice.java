import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsPractice {

	public static void main(String[] args) {

		// Autobox an integer primitive into an ArrayList
		ArrayList<Integer> myInts = new ArrayList<Integer>();
		myInts.add(42);
		System.out.println(myInts.get(0) + " is in a box!!");

		// Unbox the integer primitive type from the Wrapper
		int myInt = myInts.get(0);
		System.out.println(myInt + " is primitive!");

		// Instantiate the List Collection with 5 names
		List<String> names = new ArrayList<>(Arrays.asList("Bob", "Susan", "James", "Fred", "Chris"));

		// Print the names to the console
		for (Object o : names) {
			System.out.println(o);
		}

		System.out.println("\n");

		// Sort the list alphabetically (natural order)
		// and print to console
		Collections.sort(names);
		System.out.println(names);

		// Search for the name "Susan" and print the location
		System.out.println(Collections.binarySearch(names, "Susan"));

		// Search for the name "Jimmy" and print the location
		System.out.println(Collections.binarySearch(names, "Jimmy"));

		// Shuffle the list and print the new list
		Collections.shuffle(names);
		System.out.println(names);

		// Transform Array List to plain String Array
		String[] name = names.toArray(new String[0]);

		// Print Array items
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}

		System.out.println("\n");

		// Transform Array back to a new ArrayList Collection
		List<String> names2 = Arrays.asList(name);

		// Print new ArrayList to show no data loss.
		for (Object o : names2) {
			System.out.println(o);
		}
	}

}
