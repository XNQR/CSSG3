package lab2;

import java.util.Scanner;

public class P2_Sale_price {

	public static void main(String[] args) {
		double original_price, percentage_discount;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter original price: ");
		original_price = input.nextDouble();
		
		System.out.println("Enter discount percentage without percent sign: ");
		percentage_discount = input.nextDouble();
		
		input.close();
		
		double discount = percentage_discount / 100;
		
		double sale_price = original_price * discount;
		
		System.out.println("Sale price for original price " + original_price + " and discount " + percentage_discount + "%: " + sale_price);

	}

}
