package ejercicios;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

class ResultSA {
	public static int simpleArraySum(List<Integer> arr, int n) {
		int sum = 0;
		for (int i = 0; i < arr.size(); i++) {
			sum = sum + arr.get(i);
		}
		--n;
		return sum;
	}

}

public class SimpleArraySun {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Por favor, ingresa los valores del arreglo:");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int n = Integer.parseInt(br.readLine().trim());

		List<Integer> arr = Stream.of(br.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());

		int result = ResultSA.simpleArraySum(arr, n);

		System.out.println("La suma de sus elementos es: " + result);

		br.close();
	}

}
