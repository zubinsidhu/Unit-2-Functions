import java.util.Scanner;
public class Lab02_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter minutes: ");
		int minutes = input.nextInt();
		int hours = minutes / 60;
		int days = hours / 24;
		int years = days / 365;
		int outputDays = days % 365;
		System.out.println(minutes + " minutes is " + years + " years and " + outputDays + " days ");
		input.close();
	}

}
