import java.util.Scanner;
public class Lab02_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer between 0 and 1000: ");
		int number = input.nextInt();
		int d1 = number % 10;
		number /= 10;
		int d2 = number % 10;
		number /=10;
		int d3 = number % 10;
		int sum = d1 + d2 + d3;
		System.out.println("Sum: " + sum);
		input.close();
	}

}
