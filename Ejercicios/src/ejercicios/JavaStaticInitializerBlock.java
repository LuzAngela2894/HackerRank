package ejercicios;

import java.util.Scanner;

public class JavaStaticInitializerBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner area = new Scanner(System.in);

		int b = area.nextInt();
		int h = area.nextInt();

		if (b > 0 && h > 0) {
			int paralelogramo = b * h;
			System.out.println(paralelogramo);
		} else {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}

		area.close();
	}

}
