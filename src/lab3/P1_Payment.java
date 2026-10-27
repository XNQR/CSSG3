package lab3;

import java.util.Scanner;

public class P1_Payment {

	public static void main(String[] args) {
		// Welcome
		System.out.println("Selamat datang!");
		System.out.println("Welcome to use the payment system!");
		System.out.println();

		// Read
		double pricePerItem, quantity, discount, deliveryFee, packagingFee, taxRate;
		final double DEFAULT_DISCOUNT = 12, DEFAULT_TAX_RATE = 6;
		String line;

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the price per item (RM): ");
		pricePerItem = input.nextDouble();

		System.out.print("Please enter the quantity:            ");
		quantity = input.nextDouble();

		System.out.print("Please enter the discount (%)\n");
		System.out.print("(leave blank for 12%):                ");
		input.nextLine(); // Consume the newline
		line = input.nextLine();
		try {
			discount = Double.parseDouble(line);
		} catch (NumberFormatException e) {
			discount = DEFAULT_DISCOUNT;
		}

		System.out.print("Please enter the delivery fee (RM):   ");
		deliveryFee = input.nextDouble();

		System.out.print("Please enter the packaging fee (RM):  ");
		packagingFee = input.nextDouble();

		System.out.print("Please enter the tax rate (%)\n");
		System.out.print("(leave blank for 6%):                 ");
		input.nextLine();
		line = input.nextLine();
		try {
			taxRate = Double.parseDouble(line);
		} catch (NumberFormatException e) {
			taxRate = DEFAULT_TAX_RATE;
		}

		// Calculate
		final double PERCENTAGE = 100.0;

		double merchandiseSubtotal = pricePerItem * quantity;
		double discountAmount = merchandiseSubtotal * discount / PERCENTAGE;
		double netMerchandisePrice = merchandiseSubtotal - discountAmount;
		double taxAmount = netMerchandisePrice * taxRate / PERCENTAGE;
		double finalPayment = netMerchandisePrice + taxAmount + deliveryFee + packagingFee;

		// Print
		System.out.println();
		System.out.println("YOUR BILL IS HERE:");
		System.out.println("-------------------------------");
		System.out.println("Merchandise subtotal:  RM" + String.format("%.2f", merchandiseSubtotal));
		System.out.println("Discount amount:       RM" + String.format("%.2f", discountAmount));
		System.out.println("Net merchandise price: RM" + String.format("%.2f", netMerchandisePrice));
		System.out.println("Tax amount:            RM" + String.format("%.2f", taxAmount));
		System.out.println("Delivery fee:          RM" + String.format("%.2f", deliveryFee));
		System.out.println("Packaging fee:         RM" + String.format("%.2f", packagingFee));
		System.out.println("Final payment:         RM" + String.format("%.2f", finalPayment));
		System.out.println("-------------------------------");
		System.out.println();

		// Goodbye
		System.out.println("Press Enter to exit.");
		input.nextLine();
		input.close();
		System.out.println("Goodbye! ;)");

	}

}
