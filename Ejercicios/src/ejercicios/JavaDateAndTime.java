package ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

class ResultDateTime {
	public static String findDay(int month, int day, int year) {
		LocalDate date = LocalDate.of(year, month, day);
		return date.getDayOfWeek().toString();
	}
}

public class JavaDateAndTime {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String[] firstMultipleInput = br.readLine().replaceAll("\\s+$", "").split(" ");

		int month = Integer.parseInt(firstMultipleInput[0]);

		int day = Integer.parseInt(firstMultipleInput[1]);

		int year = Integer.parseInt(firstMultipleInput[2]);

		String res = ResultDateTime.findDay(month, day, year);
		
		System.out.println(res);

		br.close();
	}

}
