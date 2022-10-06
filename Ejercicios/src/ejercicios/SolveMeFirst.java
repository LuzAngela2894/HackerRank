package ejercicios;

import java.io.*;


class ResultSF {
	public static void solveMeFirst(int a, int b) {
		int sum = 0;
		sum = a + b;
		System.out.println(sum);
	}
}

public class SolveMeFirst {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Por favor, ingresa el primer valor:");
		int a = 0;
		try {
			a = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Por favor, ingresa el segundo valor:");
		int b = 0;
		try {
			b = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Resultado:");
		ResultSF.solveMeFirst(a, b);
		br.close();
	}

}
