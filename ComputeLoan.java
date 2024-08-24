import java.util.Scanner;
public class ComputeLoan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter annual interest rate in %: ");
		double annualInterest = input.nextDouble();
		double monthlyInterest = (annualInterest / 12) / 100.0;
		System.out.println("Enter number of years to make payments: ");
		int numOfYears = input.nextInt();
		System.out.println("Enter loan amount: ");
		double loanAmount = input.nextDouble();
		double monthlyPayment = loanAmount * monthlyInterest / (1 - 1 / (Math.pow(1 + monthlyInterest, numOfYears * 12)));
		double totalPayment = monthlyPayment * 12 * numOfYears;
		System.out.println("Monthly payment: $" + (int)(monthlyPayment * 100) / 100.0);
		System.out.println("Total payment: $" + (int)(totalPayment * 100) / 100.0);
		input.close();
	}

}
