package ejercicios;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

//Ejercicio=> Dada una matriz cuadrada, calcule la diferencia entre las sumas de sus diagonales.

class ResultD {
	public static int diagonalDifference(List<List<Integer>> arr) {
		// Inicializando variables
		int leftdiagonal = 0, rightdiagonal = 0;
		// for(inicio, final, incremento o decremento).
		// Recorrido del arreglo en las dos diagonales.
		for (int i = 0, j = arr.get(0).size() - 1; i < arr.get(0).size(); i++, j--) {
			leftdiagonal = leftdiagonal + arr.get(i).get(i);
			rightdiagonal = rightdiagonal + arr.get(i).get(j);
		}
		// Método que permite calcular el valor absoluto de un número.
		return Math.abs(leftdiagonal - rightdiagonal);
	}
}

public class DiagonalDifference {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Por favor, ingresa los valores de la matriz:");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		// InputStreamReader convierte el System.in en Reader.
		// BufferedReader solo lee cadenas de textos y no números.
		// Por ello es necesario usar el método parseInt() para que devuelva un entero.
		// El método trim() elimina los caracteres blancos iniciales y finales de la
		// cadena.
		int n = Integer.parseInt(br.readLine().trim());

		// Convierte un array de enteros primitivos en una lista de enteros.
		// List es una coleccion. Una coleccion puede ser interfaces y clase abstracta.
		// ArrayList es un contenedor que contiene una implementación de la colección
		// List.
		List<List<Integer>> arr = new ArrayList<>();

		// Encajona cada elemento de la secuencia a un número entero.
		// Acumula los elementos de entrada en una nueva lista.
		IntStream.range(0, n).forEach(i -> {

		try {
			arr.add(Stream.of(br.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
						.collect(toList()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		});

		int result = ResultD.diagonalDifference(arr);

		System.out.println("Diferencia entre las sumas de las 2 diagonales de la matriz: " + result);

		br.close();
	}

}
