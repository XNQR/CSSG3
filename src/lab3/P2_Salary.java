package lab3;

import java.time.YearMonth;
import java.util.Scanner;

public class P2_Salary {

	public static void main(String[] args) {
		// Welcome
		System.out.println("Selamat datang!");
		System.out.println("Welcome to use the salary system!");
		System.out.println();

		// Read
		double basicSalary, housingAllowance, transportAllowance, overtimeHours, overtimeRate, retirementContribution, otherDeductions;
		final double DEFAULT_RETIREMENT_CONTRIBUTION = 10.0;
		final int MONTHS = 12;
		String line;

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the basic salary (RM):            ");
		basicSalary = input.nextDouble();

		System.out.print("Please enter the housing allowance (RM):       ");
		housingAllowance = input.nextDouble();

		System.out.print("Please enter the transport allowance (RM):     ");
		transportAllowance = input.nextDouble();
		
		System.out.print("Please enter the overtime hours:               ");
		overtimeHours = input.nextDouble();

		System.out.print("Please enter the overtime rate (RM/hour):      ");
		overtimeRate = input.nextDouble();

		System.out.print("Please enter the retirement contribution (RM)\n");
		System.out.print("(leave blank for " + String.format("%.0f", DEFAULT_RETIREMENT_CONTRIBUTION) + "%):                         ");
		input.nextLine(); // Consume the newline
		line = input.nextLine();
		try {
			retirementContribution = Double.parseDouble(line);
		} catch (NumberFormatException e) {
			retirementContribution = DEFAULT_RETIREMENT_CONTRIBUTION;
		}
				
		System.out.print("Please enter the other deductions (RM):        ");
		otherDeductions = input.nextDouble();
		
		input.nextLine();

		// Calculate
		final double PERCENTAGE = 100.0;

		double overtimePay = overtimeHours * overtimeRate;
		double grossSalary = basicSalary + housingAllowance + transportAllowance + overtimePay;
		retirementContribution = grossSalary * retirementContribution / PERCENTAGE;
		double totalDeductions = retirementContribution + otherDeductions;
		double netSalary = grossSalary - totalDeductions;
		double annualNetSalary = netSalary * MONTHS;

		// Print
		System.out.println();
		System.out.println("YOUR SALARY IS HERE:");
		System.out.println("-----------------------------------");
		System.out.println("Overtime pay:            RM" + String.format("%.2f", overtimePay));
		System.out.println("Gross salary:            RM" + String.format("%.2f", grossSalary));
		System.out.println("Retirement contribution: RM" + String.format("%.2f", retirementContribution));
		System.out.println("Total deductions:        RM" + String.format("%.2f", totalDeductions));
		System.out.println("Net salar:               RM" + String.format("%.2f", netSalary));
		System.out.println("Annual net salary:       RM" + String.format("%.2f", annualNetSalary));
		System.out.println("-----------------------------------");
		System.out.println();

		// Goodbye
		System.out.println("Press Enter to exit.");
		input.nextLine();
		input.close();
		System.out.println("Goodbye! ;)");

	}

}
