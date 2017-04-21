// importing the class and declaring an instance of it
import java.io.*;

public class JHangman {
// Instance Variables
	private static String word;
	private static String workingWord;
	private static String status;
	private static int numberOfTries;
	private static int MAX_NUMBER_OF_TRIES = 3;
	private static String errorMessage;

	JHangman() {
		numberOfTries = 0;
		status = "";
	}

	private static void setWord(String w) {
		word = w;
	}
