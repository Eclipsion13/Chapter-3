package excercises;

import java.util.Scanner;

public class TestLBS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int lbs;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("How much do you weigh in pounds? >> ");
		lbs = keyboard.nextInt();
		
		lbsToKilos(lbs);
		lbsToOz(lbs);
		lbsToMg(lbs);

	}
	public static void lbsToKilos(int lbs) {
		final double KILOS = 0.45;
		double conversion;
		conversion = lbs * KILOS;
		String type = "Kilos";
		
		displayConversions(lbs,type,conversion);
	}
	public static void lbsToOz(int lbs) {
		final double OZ = 16;
		double conversion;
		conversion = lbs * OZ;
		String type = "Ounces";

		displayConversions(lbs,type,conversion);
	}
	public static void lbsToMg(int lbs) {
		final double MG = 453592;
		double conversion;
		conversion = lbs * MG;
		String type = "Miligrams";
		
		displayConversions(lbs,type,conversion);
	}
	public static void displayConversions(int lbs, String type, double conversion) {
		System.out.println(lbs + " pounds is equal to " + conversion + " " + type);
	}

}
