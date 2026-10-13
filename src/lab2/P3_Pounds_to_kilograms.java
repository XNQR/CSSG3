package lab2;

import java.util.Scanner;

public class P3_Pounds_to_kilograms {

	public static void main(String[] args) {
		double parcel_pounds;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter parcel weight in pounds: ");
		parcel_pounds = input.nextDouble();
		
		input.close();
		
		final double POUNDS_TO_KILOGRAMS = 0.45;
		
		double parcel_kilograms = parcel_pounds * POUNDS_TO_KILOGRAMS;
		
		System.out.println("Parcel weight in kilograms: " + parcel_kilograms);

	}

}
