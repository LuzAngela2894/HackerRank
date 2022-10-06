package ejercicios;

import java.util.Scanner;

public class OutputFormatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String str = scanner.next();
			int entero = scanner.nextInt();

			System.out.printf("%-15s%03d%n", str, entero);

		}
		System.out.println("================================");
		scanner.close();
	}

}
