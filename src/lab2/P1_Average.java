package lab2;

import java.util.Scanner;

public class P1_Average {

	public static void main(String[] args) {
		double number_1, number_2, number_3;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number 1: ");
		number_1 = input.nextDouble();
		
		System.out.println("Enter number 2: ");
		number_2 = input.nextDouble();
		
		System.out.println("Enter number 3: ");
		number_3 = input.nextDouble();
		
		input.close();
		
		double summary = number_1 + number_2 + number_3;
		
		double average = summary / 3;
		
		System.out.println("Average for " + number_1 + ", " + number_2 + " and " + number_3 + ": " + average);

	}

}
