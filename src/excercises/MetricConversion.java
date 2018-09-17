package excercises;

import java.util.Scanner;

public class MetricConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double input;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Input a number: ");
		input = keyboard.nextDouble();
		
		convertCent(input);
		convertLit(input);

	}
	public static void convertCent(double input) {
		final double CENT = 2.54;
		double centi;
		centi = input * CENT;
		System.out.println(input + " inches is " + centi + " centimeters");
	}
	public static void convertLit(double input) {
		final double LIT = 3.7854;
		double litres;
		litres = input * LIT;
		System.out.println(input + " gallons is " + litres + " litres");
	}

}
