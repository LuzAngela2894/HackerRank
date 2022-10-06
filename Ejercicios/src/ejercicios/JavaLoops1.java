package ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ResultLoop1 {
	public static void javaloops1(int N) {
		if (N >= 2 && N <= 20) {
			int result = 0;
			for (int i = 1; i <= 10; i++) {
				result = N * i;
				System.out.println(N + " x " + i + " = " + result);
			}
		}
	}
}

public class JavaLoops1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Por favor, ingresa el valor de N:");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int N = Integer.parseInt(br.readLine().trim());

		ResultLoop1.javaloops1(N);

		br.close();

	}

}
