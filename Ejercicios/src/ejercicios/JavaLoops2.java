package ejercicios;

import java.util.Scanner;

public class JavaLoops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int q = input.nextInt();

		for (int i = 0; i < q; i++) {
			int a = input.nextInt();
			int b = input.nextInt();
			int n = input.nextInt();
			int sum = a;
			for (int j = 0; j < n; j++) {
				sum = (int) (sum + Math.pow(2, j) * b);
				System.out.printf("%d ", sum);
			}
			System.out.println();
		}

		input.close();

	}
}
