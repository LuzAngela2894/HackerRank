package ejercicios;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr = new Scanner(System.in);

		int testCases = Integer.parseInt(sr.nextLine());

		while (testCases > 0) {
			String pattern = sr.nextLine();
			try {
				Pattern checkPattern = Pattern.compile(pattern);
				System.out.println("Valid");
			} catch (PatternSyntaxException e) {
				System.out.println("Invalid");
			}
			testCases--;
		}

		sr.close();
	}

}
