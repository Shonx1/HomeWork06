package Task05;

import java.util.Scanner;

public class Convert {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter temp in Celsius: ");
		double cels = in.nextFloat();
		double fahr = (cels * 9 / 5) + 32;
		System.out.print(fahr);

	}

}