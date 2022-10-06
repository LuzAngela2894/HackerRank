package ejercicios;

import java.io.*;

//Ejercicio => programa que imprima una escalera de n tama�o.

class ResultS {
	public static void staircase(int n) {
		// Inicializando variables
		int simbolos = 1, espacios = n - 1;
		// Mientras que el tama�o sea mayor que cero ejecuta los ciclos for
		// for(inicio, final, incremento)
		// Un for dibuja los espacios
		// Otro for dibuja los simbolos hasta llegar al tama�o n
		while (n > 0 && n <= 100) {
			for (int i = 0; i < espacios; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < simbolos; i++) {
				System.out.print("#");
			}
			simbolos = simbolos + 1;
			espacios = espacios - 1;
			--n;
			System.out.println("");
		}
	}
}

public class Staircase {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Por favor, ingresa el tama�o de la escalera:");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		// InputStreamReader convierte el System.in en Reader.
		// BufferedReader solo lee cadenas de textos y no n�meros.
		// Por ello es necesario usar el m�todo parseInt() para que devuelva un entero.
		// El m�todo trim() elimina los caracteres blancos iniciales y finales de la
		// cadena.
		int n = Integer.parseInt(br.readLine().trim());

		System.out.println("�Escalera!");

		ResultS.staircase(n);

		br.close();

	}

}
