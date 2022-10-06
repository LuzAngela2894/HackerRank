package ejercicios;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

class ResultBS {
	public static long aVeryBigSum(List<Long> arr, int n) {
		long sum = 0;
		for (int i = 0; i < arr.size(); i++) {
			sum = sum + arr.get(i);
		}
		--n;
		return sum;
	}
}

public class AVeryBigSum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Por favor, ingresa los valores del arreglo:");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int n = Integer.parseInt(br.readLine().trim());

		List<Long> arr = Stream.of(br.readLine().replaceAll("\\s+$", "").split(" ")).map(Long::parseLong)
				.collect(toList());

		long result = ResultBS.aVeryBigSum(arr, n);

		System.out.println("La suma de sus elementos es: " + result);

		br.close();
	}

}
