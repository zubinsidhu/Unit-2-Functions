import java.util.Scanner;
public class ComputeChange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter amount in dollars.cents: $");
		double amount = input.nextDouble();
		int changes = (int)(amount * 100);
		int dollars = changes / 100;
		changes %= 100;
		int quarters = changes / 25;
		changes %= 25;
		int dimes = changes / 10;
		changes %= 10;
		int nickels = changes / 5;
		int pennies = changes % 5;
		
		System.out.println("Your amount of $" + amount + " consists of: \n" 
		+ dollars + " Dollars\n" 
		+ quarters + " Quarters\n" 
		+ dimes + " Dimes\n" 
		+ nickels + " Nickels\n" 
		+ pennies + " Pennies\n");
		input.close();
	}

}
