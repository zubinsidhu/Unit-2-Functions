import java.util.Scanner;
public class AreaOfCircleInput {

	public static void main(String[] args) {
		//Declare variables for radius, area, ask user to input radius
		System.out.print("Enter radius: ");
		Scanner inputRadius = new Scanner(System.in);
		double radius = inputRadius.nextDouble();
		double area;
				
		//Compute Area
		area = radius * radius * 3.14159;
		
		//Display Results
		System.out.println("The area for a circle with radius of " + radius + ": " + area);
		inputRadius.close();
	}
}