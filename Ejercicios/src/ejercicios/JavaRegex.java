package ejercicios;

import java.util.Scanner;

class MyRegex {
	String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
	String pattern = num + "." + num + "." + num + "." + num;
}

public class JavaRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr = new Scanner(System.in);

		while (sr.hasNext()) {
			String IP = sr.next();
			System.out.println(IP.matches(new MyRegex().pattern));
		}

		sr.close();
	}

}
