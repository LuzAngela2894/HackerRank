package ejercicios;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

class ResultPM {
	public static void plusMinus(List<Integer> arr, int n) {
		int negativo = 0;
		int cero = 0;
		int positivo = 0;

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) > 0) {
				positivo = positivo + 1;
			} else if (arr.get(i) < 0) {
				negativo = negativo + 1;
			} else if (arr.get(i) == 0) {
				cero = cero + 1;
			}
		}

		System.out.println((double) positivo / (double) n);
		System.out.println((double) negativo / (double) n);
		System.out.println((double) cero / (double) n);
		
	}

}

public class PlusMinus {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Por favor, ingresa los valores del arreglo:");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int n = Integer.parseInt(br.readLine().trim());

		List<Integer> arr = Stream.of(br.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());

		ResultPM.plusMinus(arr, n);

		br.close();
	}

}
