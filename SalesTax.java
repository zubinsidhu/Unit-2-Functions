import java.util.Scanner;
public class SalesTax {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Sales Tax rate in %: ");
		int taxRateInput = input.nextInt();
		double taxRate = taxRateInput / 100.0;
		System.out.print("Enter Sale amount $: ");
		double salePrice = input.nextDouble();
		double salesTax = (int)(salePrice * taxRate * 100 + 0.5) / 100.0;
		System.out.println("Sales Tax: $" + salesTax);
		input.close();
	}

}
