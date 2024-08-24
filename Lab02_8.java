import java.util.Scanner;
public class Lab02_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter width and height of rectangle: ");
		double width = input.nextDouble();
		double height = input.nextDouble();
		double area = width * height;
		double perimeter = (width * 2) + (height * 2);
		double diagonal = Math.sqrt((width * width) + (height * height));
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Diagonal: " + diagonal);
		input.close();
	}

}