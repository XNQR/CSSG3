package lab2;

import java.util.Scanner;

public class P4_BMI {

	public static void main(String[] args) {
		double weight, height;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter weight (kg): ");
		weight = input.nextDouble();
		
		System.out.println("Enter height (m): ");
		height = input.nextDouble();
		
		input.close();
		
		double bmi = weight / (height * height);
		
		System.out.println("BMI for " + weight + " kg" + " and " + height + " m: " + bmi);

	}

}
