package ejercicios;

import java.util.Scanner;

public class JavaEndOfFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int index = 1;

		Scanner sr = new Scanner(System.in);

		while (true) {
			String txt = sr.nextLine();
			System.out.println(index + " " + txt);
			if (!sr.hasNext()) {
				break;
			}
			index++;
		}

		sr.close();
	}

}
