import java.util.Scanner;
public class Lab02_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x1 and y1: ");
		double x_1 = input.nextDouble();
		double y_1 = input.nextDouble();
		System.out.print("Enter x2 and y2: ");
		double x_2 = input.nextDouble();
		double y_2 = input.nextDouble();
		double distance = Math.sqrt(((x_1 - x_2) * (x_1 - x_2)) + ((y_1 - y_2) * (y_1 - y_2)));
		System.out.println("Distance between (" + x_1 + ", " + y_1 + ") and (" 
		+ x_2 + ", " + y_2 + ") is " + distance);
		input.close();
	}

}
