package ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StdInOutII {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);		
		int entero = Integer.parseInt(br.readLine());
		double flotante = Double.parseDouble(br.readLine());		
		String str = br.readLine();		
		br.close();

		System.out.println("String: " + str);
		System.out.println("Double: " + flotante);
		System.out.println("Int: " + entero);
	}

}
