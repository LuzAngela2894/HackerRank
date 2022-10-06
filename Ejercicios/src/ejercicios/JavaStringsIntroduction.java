package ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaStringsIntroduction {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String A = br.readLine();
		String B = br.readLine();

		System.out.println(A.length() + B.length());
		String resultado = A.compareTo(B) > 0 ? "Si" : "No";
		System.out.println(resultado);
		System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1, A.length()) + " "
				+ B.substring(0, 1).toUpperCase() + B.substring(1, B.length()));
		
		br.close();
	}

}
