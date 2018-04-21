import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.IOException;

public class FileReaderRegexTest {

	public static void main(String[] args) {

		try {

			// Import the file and instantiate all classes that are needed to
			// process the file.
			File file = new File("ValenciaCourses.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			FileWriter fileWriter = new FileWriter("output.txt");

			// Create and set initial variables
			String line;
			int courseCount = 0;
			int lineCount = 0;
			
			// Begin run and continue while the file still has lines to read
			while ((line = bufferedReader.readLine()) != null) {
				lineCount++;
				
				// Search for one of 4 possible strings (# represents a digit):
				// (" # # #"), (" # # ##"), (" ## # #"), (" ## # ##")
				String myRegex = "(\\s\\d\\s\\d\\s([4-9]|[1-9][0-9]))|(\\s\\d\\d\\s\\d\\s([4-9]|[1-9][0-9]))";

				Pattern pattern = Pattern.compile(myRegex);

				Matcher matcher = pattern.matcher(line);

				// If a match is found, increment the course count by 1 and
				// write the course
				// to the output file.
				if (matcher.find()) {
					courseCount++;
					fileWriter.write(line + "\n");
				}
			}

			// End the output file with the number of courses found.
			fileWriter.write("The number of courses with more than 3 hours of lab is: " + courseCount);
			fileWriter.write("I read " + lineCount + " lines of file!");

			// Close all reader and writer objects.
			fileReader.close();
			fileWriter.close();

		} catch (IOException ioe) {
			System.out.println("Please check your file");
		}
	}

}
