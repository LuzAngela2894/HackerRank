package ejercicios;

import java.util.Scanner;

public class JavaSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr = new Scanner(System.in);

		String str = sr.next();
		int start = sr.nextInt();
		int end = sr.nextInt();
		
		sr.close();
		
		System.out.println(str.substring(start, end));

	}

}
