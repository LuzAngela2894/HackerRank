package ejercicios;

import java.util.Scanner;

public class JavaSubstringComparisons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr = new Scanner(System.in);

		String str = sr.next();
		int k = sr.nextInt();

		sr.close();

		System.out.println(getSmallestAndLargest(str, k));
	}

	public static String getSmallestAndLargest(String str, int k) {
		int n = str.length();

		String smallest = str.substring(0, k);
		String largest = str.substring(0, k);

		for (int i = 0; i < n - k + 1; i++) {
			String temp = str.substring(i, i + k);
			largest = largest.compareTo(temp) > 0 ? largest : temp;
			smallest = smallest.compareTo(temp) < 0 ? smallest : temp;
		}

		return smallest + "\n" + largest;
	}

}
