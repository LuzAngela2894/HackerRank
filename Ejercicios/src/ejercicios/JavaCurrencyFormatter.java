package ejercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner moneda = new Scanner(System.in);

		double payment = moneda.nextDouble();

		moneda.close();

		if (payment >= 0 && payment <= Math.pow(10, 9)) {

			System.out.println("US: " + conversionPayment(payment, Locale.US));
			DecimalFormat formatea = new DecimalFormat("###,###.##");
			System.out.println("India: " + "Rs." + formatea.format(payment));
			System.out.println("China: " + conversionPayment(payment, Locale.CHINA));
			System.out.println("France: " + conversionPayment(payment, Locale.FRANCE));

		}

	}

	public static String conversionPayment(double payment, Locale country) {
		NumberFormat nF = NumberFormat.getCurrencyInstance(country);
		return nF.format(payment);
	}

}
