package ejercicios;

import java.util.Scanner;

public class JavaIntToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if (n >= -100 && n <= 100) {
			String str = Integer.toString(n);
			System.out.println(str + "Good job");
		}

		else
			System.out.println("Wrong answer");

		sc.close();
	}

}
