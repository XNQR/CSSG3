package lab2;

import java.util.Scanner;

public class P5_Promotion {

	public static void main(String[] args) {
		double product_price, product_quantity;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter price of product: ");
		product_price = input.nextDouble();
		
		System.out.println("Enter quantity of product: ");
		product_quantity = input.nextDouble();
		
		input.close();
		
		double total_price = product_price * product_quantity;
		
		final double DISCOUNT = 0.11;
		double discount = total_price * DISCOUNT;
		
		double total_price_after_discount = total_price - discount;
		
		System.out.println("Total purchase price : RM" + total_price + "0");
		System.out.println("Total discount : RM" + discount + "0");
		System.out.println("Total purchase price after discount : RM" + total_price_after_discount + "0");

	}

}
