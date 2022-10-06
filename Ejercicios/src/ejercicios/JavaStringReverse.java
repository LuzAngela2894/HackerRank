package ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaStringReverse {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String A = br.readLine();
		StringBuilder builder = new StringBuilder(A);
		String B = builder.reverse().toString();

		br.close();

		String resultado = A.equals(B) ? "Yes" : "No";

		System.out.println(resultado);
	}

}
