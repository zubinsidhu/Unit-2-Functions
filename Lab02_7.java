import java.util.Scanner;
public class Lab02_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the distance to drive: ");
		double distDrive = input.nextDouble();
		System.out.print("Enter the fuel efficiency in Miles Per Gallon: ");
		double fuelEfficiency = input.nextDouble();
		System.out.print("Enter the price per gallon: ");
		double pricePerGallon = input.nextDouble();
		double amountGallons = distDrive / fuelEfficiency;
		double costDriving = amountGallons * pricePerGallon;
		System.out.print("Cost of driving " + distDrive + " miles: $" + costDriving);
		input.close();
	}

}
