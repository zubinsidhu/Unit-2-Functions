import java.util.Scanner;
public class Project_CalculatingFutureInvestmentRate {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter investment amount: ");
		double investmentAmount = input.nextDouble();
		System.out.print("Enter annual interest rate: ");
		double annualInterestRate = input.nextDouble();
		System.out.print("Enter number of years: ");
		int numberOfYears = input.nextInt();
		double monthlyInterestRate = (annualInterestRate / 100) / 12;
		double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), (numberOfYears * 12));
		System.out.print("Accumulated value is " + (int)(futureInvestmentValue * 100) / 100.0);
		input.close();
	}

}
