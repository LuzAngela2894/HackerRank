package ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class JavaAnagrams {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String A = br.readLine().toLowerCase();
		String B = br.readLine().toLowerCase();

		br.close();

		A = A.replaceAll(" ", "");
		B = B.replaceAll(" ", "");

		char[] C = A.toCharArray();
		char[] D = B.toCharArray();

		Arrays.sort(C);
		Arrays.sort(D);

		String str1 = new String(C);
		String str2 = new String(D);

		String resultado = str1.equals(str2) ? "Anagrams" : "Not Anagrams";

		System.out.println(resultado);

	}

}
