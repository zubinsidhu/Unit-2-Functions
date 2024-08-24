import java.util.Scanner;
public class TestBooleanOperators {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer");
		int n = input.nextInt();
		input.close();
		
		if (n % 2 == 0 && n %  3 == 0) {
			System.out.println(n + "is divisible by 2 AND 3.");
		}
		if (n % 2 == 0 || n %  3 == 0) {
			System.out.println(n + "is divisible by 2 OR 3.");
		}
		if (n % 2 == 0 ^ n %  3 == 0) {
			System.out.println(n + "is divisible by 2 OR 3, but NOT BOTH.");
		}
		
	}

}
