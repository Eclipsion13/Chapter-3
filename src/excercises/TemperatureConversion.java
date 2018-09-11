package excercises;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		// (Fahrenheit - 32) * .5556 = Celsius
		double fahr1;
		double fahr2;
		double fahr3;
		String time1 = "8:00";
		String time2 = "12:00";
		String time3 = "5:00";
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Please enter the temperature at 8:00 in F >> ");
		fahr1 = inputDevice.nextDouble();
		System.out.print("Please enter the temperature at 12:00 in F >> ");
		fahr2 = inputDevice.nextDouble();
		System.out.print("Please enter the temperature at 5:00 in F >> ");
		fahr3 = inputDevice.nextDouble();
		
		conversionFormula(fahr1, time1);
		conversionFormula(fahr2, time2);
		conversionFormula(fahr3,time3);

	}
	public static void conversionFormula(double input, String time) {
		
		double output;
		output = (input - 32) * .5556;
		
		System.out.println("The tempurature at " + time + " in C is " + output);
		
	}

}
