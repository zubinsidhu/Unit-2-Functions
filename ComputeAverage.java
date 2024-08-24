import java.util.Scanner;
public class ComputeAverage {
	public static void main(String[] args) {
		//Create scanner object
		Scanner input = new Scanner(System.in);
		/*
		System.out.println("Enter n1: ");
		double n1 = input.nextDouble():
		System.out.println("Enter n2: ");
		double n2 = input.nextDouble():
		System.out.println("Enter n3: ");
		double n3 = input.nextDouble():
		 */
		System.out.println("Enter 3 numbers: ");
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		double n3 = input.nextDouble();
		
		System.out.println("Average: " + (n1 + n2 + n3) / 3);
		input.close();
	}
}