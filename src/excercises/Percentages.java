package excercises;

import java.util.Scanner;

public class Percentages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;
		double y;
		
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.print("Insert a number >>> ");
		x = inputDevice.nextDouble();
		System.out.print("Insert a number >>> ");
		y = inputDevice.nextDouble();
		
		computePercent(x,y);

	}
	public static void computePercent(double x, double y) {
		
		double compute;
		
		compute = (x / y) * 100;
		System.out.println(x + " percent of " + y + " equals " + compute + "%");
	}

}
