package lab3;

import java.util.Scanner;

public class P3_Electricity_bill {

	public static void main(String[] args) {
		// Welcome
		System.out.println("Selamat datang!");
		System.out.println("Welcome to use the electricity billing system!");
		System.out.println();

		// Read
		double electricityConsumption, ratePer_kWh, monthlyserviceCharge;
		final double TAX_RATE = 6.0;

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the electricity consumption (kWh): ");
		electricityConsumption = input.nextDouble();

		System.out.print("Please enter the rate per kWh (RM):             ");
		ratePer_kWh = input.nextDouble();

		System.out.print("Please enter the monthly service charge (RM):   ");
		monthlyserviceCharge = input.nextDouble();

		// Calculate
		final double PERCENTAGE = 100.0;

		double energyCharge = electricityConsumption * ratePer_kWh;
		double subtotal = energyCharge + monthlyserviceCharge;
		double taxAmount = subtotal * TAX_RATE / PERCENTAGE;
		double totalBill = subtotal + taxAmount;

		// Print
		System.out.println();
		System.out.println("YOUR ELECTRICITY BILL IS HERE:");
		System.out.println("--------------------------------");
		System.out.println("Energy charge:          RM" + String.format("%.2f", energyCharge));
		System.out.println("Subtotal:               RM" + String.format("%.2f", subtotal));
		System.out.println("Tax amount:             RM" + String.format("%.2f", taxAmount));
		System.out.println("Total electricity bill: RM" + String.format("%.2f", totalBill));
		System.out.println("--------------------------------");
		System.out.println();

		// Goodbye
		System.out.println("Press Enter to exit.");
		input.nextLine();
		input.close();
		System.out.println("Goodbye! ;)");

	}

}