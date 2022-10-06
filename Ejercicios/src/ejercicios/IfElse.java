package ejercicios;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int residuo = n % 2;
		if (residuo != 0) {
			System.out.println("Weird");
		} else if (n >= 2 && n <= 5) {
			System.out.println("Not Weird");
		} else if (n >= 6 && n <= 20) {
			System.out.println("Weird");
		} else if (n > 20) {
			System.out.println("Not Weird");
		}
		scanner.close();
	}

}
