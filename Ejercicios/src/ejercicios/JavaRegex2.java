package ejercicios;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex = "\\b(\\w+)(\\W+\\1\\b)+";
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

		Scanner sr = new Scanner(System.in);
		int numSentences = Integer.parseInt(sr.nextLine());

		while (numSentences-- > 0) {
			String input = sr.nextLine();
			Matcher m = p.matcher(input);

			while (m.find()) {
				input = input.replaceAll(m.group(), m.group(1));
			}

			System.out.println(input);
		}
		sr.close();
	}

}
