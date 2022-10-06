package ejercicios;

import java.util.Scanner;

public class JavaStringTokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr = new Scanner(System.in);

		String str = sr.nextLine().trim();

		String[] strArray = str.split("[!,?._'@ ]+");

		int x = strArray.length;

		if (isEmptyString(str) == true) {
			x = 0;
		}

		System.out.println(x);
		for (String a : strArray)
			System.out.println(a);

		sr.close();
	}

	static boolean isEmptyString(String string) {
		return string == null || string.isEmpty();
	}

}
