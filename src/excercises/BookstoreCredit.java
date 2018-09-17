package excercises;

import java.util.Scanner;

public class BookstoreCredit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		double gpa;
		final int MULTIPLIER = 10;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("What is your name? > ");
		name = keyboard.nextLine();
		System.out.print("What is your GPA? > ");
		gpa = keyboard.nextDouble();
		
		calcCredit(name,gpa,MULTIPLIER);

	}
	public static void calcCredit(String name, double gpa, int num) {
		
		System.out.println("Hello, " + name + "! Your GPA is "
		+ gpa + " so your Bookstore credit is $" + (gpa * num));
	}

}
