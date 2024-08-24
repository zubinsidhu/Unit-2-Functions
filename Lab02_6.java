import java.util.Scanner;
public class Lab02_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x1 and y1: ");
		double x_1 = input.nextDouble();
		double y_1 = input.nextDouble();
		System.out.print("Enter x2 and y2: ");
		double x_2 = input.nextDouble();
		double y_2 = input.nextDouble();
		System.out.print("Enter x3 and y3: ");
		double x_3 = input.nextDouble();
		double y_3 = input.nextDouble();
		double s_1 = Math.sqrt(((x_1 - x_2) * (x_1 - x_2)) + ((y_1 - y_2) * (y_1 - y_2)));
		double s_2 = Math.sqrt(((x_2 - x_3) * (x_2 - x_3)) + ((y_2 - y_3) * (y_2 - y_3)));
		double s_3 = Math.sqrt(((x_1 - x_3) * (x_1 - x_3)) + ((y_1 - y_3) * (y_1 - y_3)));
		double s = (s_1 + s_2 + s_3)/2;
		double area = Math.sqrt(s * (s - s_1) * (s - s_2) * (s - s_3));
		System.out.print("Area: " + area);
		input.close();
	}

}
