package ejercicios;

import java.util.Scanner;

public class StdInOutI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int myInt1 = scanner.nextInt();
		int myInt2 = scanner.nextInt();
		int myInt3 = scanner.nextInt();
		scanner.close();

		System.out.println(myInt1);
		System.out.println(myInt2);
		System.out.println(myInt3);
	}

}
