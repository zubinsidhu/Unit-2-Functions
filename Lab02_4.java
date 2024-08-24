import java.util.Scanner;
public class Lab02_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Weight in lbs: ");
		double weight_lbs = input.nextDouble();
		System.out.print("Enter Height in Inches: ");
		double height_inches = input.nextDouble();
		final double POUND_TO_KG = 0.45359237;
		final double INCH_TO_M = 0.0254;
		double kilograms = weight_lbs * POUND_TO_KG;
		double meters = height_inches * INCH_TO_M;
		double bodyMassIndex = kilograms / Math.pow(meters, 2.0);
		System.out.println("BMI: " + bodyMassIndex);
		input.close();
	}

}