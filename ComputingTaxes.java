import java.util.Scanner;
public class ComputingTaxes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Filing Status: (0: Single), (1: Head of Household), (2: Married filing jointly), (3: Married filing separately) ");
		int filingStatus = input.nextInt();
		System.out.print("Enter income: $");
		double income = input.nextDouble();
		input.close();
		
		double tax = 0;
		if (filingStatus == 0) {
			if (income < 9700) {
				tax = income * 0.1;
			}
			else if (income < 39475) {
				tax = 9700 * 0.1 + (income - 9700) * 0.12;
			}
			else if (income < 84200) {
				tax = 9700 * 0.1 + (39475 - 9700) * 0.12 + (income - 39475) * 0.22;
			}
			else if (income < 160725) {
				tax = 9700 * 0.1 + (39475 - 9700) * 0.12 + (84200 - 39475) * 0.22 + (income - 84200) * 0.24;
			}
			else if (income < 204100) {
				tax = 9700 * 0.1 + (39475 - 9700) * 0.12 + (84200 - 39475) * 0.22 + (160725 - 84200) * 0.24 + (income - 160725) * 0.32;
			}
			else if (income < 510300) {
				tax = 9700 * 0.1 + (39475 - 9700) * 0.12 + (84200 - 39475) * 0.22 + (160725 - 84200) * 0.24 + (204100 - 160725) * 0.32 + (income - 204100) * 0.35;
			}
			else {
				tax = 9700 * 0.1 + (39475 - 9700) * 0.12 + (84200 - 39475) * 0.22 + (160725 - 84200) * 0.24 + (204100 - 160725) * 0.32 + (510300 - 204100) * 0.35 + (income - 510300) * 0.37;
			}
		}
		else if (filingStatus == 1) {
			if (income < 13850) {
				tax = income * 0.1;
			}
			else if (income < 52850) {
				tax = 13850 * 0.1 + (income - 13850) * 0.12;
			}
			else if (income < 84200) {
				tax = 13850 * 0.1 + (52850 - 13850) * 0.12 + (income - 52850) * 0.22;
			}
			else if (income < 160725) {
				tax = 13850 * 0.1 + (52850 - 13850) * 0.12 + (84200 - 52850) * 0.22 + (income - 84200) * 0.24;
			}
			else if (income < 204100) {
				tax = 13850 * 0.1 + (52850 - 13850) * 0.12 + (84200 - 52850) * 0.22 + (160700 - 84200) * 0.24 + (income - 160700) * 0.32;
			}
			else if (income < 510300) {
				tax = 13850 * 0.1 + (52850 - 13850) * 0.12 + (84200 - 52850) * 0.22 + (160700 - 84200) * 0.24 + (204100 - 160700) * 0.32 + (income - 204100) * 0.35;
			}
			else {
				tax = 13850 * 0.1 + (52850 - 13850) * 0.12 + (84200 - 52850) * 0.22 + (160700 - 84200) * 0.24 + (204100 - 160700) * 0.32 + (510300 - 204100) * 0.35 + (income - 510300) * 0.37;
			}
		}
		else if (filingStatus == 2) {
			if (income < 19400) {
				tax = income * 0.1;
			}
			else if (income < 78950) {
				tax = 19400 * 0.1 + (income - 19400) * 0.12;
			}
			else if (income < 168400) {
				tax = 19400 * 0.1 + (78950 - 19400) * 0.12 + (income - 78950) * 0.22;
			}
			else if (income < 321450) {
				tax = 19400 * 0.1 + (78950 - 19400) * 0.12 + (168400 - 78950) * 0.22 + (income - 168400) * 0.24;
			}
			else if (income < 408200) {
				tax = 19400 * 0.1 + (78950 - 19400) * 0.12 + (168400 - 78950) * 0.22 + (321450 - 168400) * 0.24 + (income - 321450) * 0.32;
			}
			else if (income < 612350) {
				tax = 19400 * 0.1 + (78950 - 19400) * 0.12 + (168400 - 78950) * 0.22 + (321450 - 168400) * 0.24 + (408200 - 321450) * 0.32 + (income - 408200) * 0.35;
			}
			else {
				tax = 19400 * 0.1 + (78950 - 19400) * 0.12 + (168400 - 78950) * 0.22 + (321450 - 168400) * 0.24 + (408200 - 321450) * 0.32 + (612350 - 408200) * 0.35 + (income - 612350) * 0.37;
			}
		}
		else if (filingStatus == 3) {
			if (income < 9700) {
				tax = income * 0.1;
			}
			else if (income < 39475) {
				tax = 9700 * 0.1 + (income - 9700) * 0.12;
			}
			else if (income < 84200) {
				tax = 9700 * 0.1 + (39475 - 9700) * 0.12 + (income - 39475) * 0.22;
			}
			else if (income < 160725) {
				tax = 9700 * 0.1 + (39475 - 9700) * 0.12 + (84200 - 39475) * 0.22 + (income - 84200) * 0.24;
			}
			else if (income < 204100) {
				tax = 9700 * 0.1 + (39475 - 9700) * 0.12 + (84200 - 39475) * 0.22 + (160725 - 84200) * 0.24 + (income - 160725) * 0.32;
			}
			else if (income < 306175) {
				tax = 9700 * 0.1 + (39475 - 9700) * 0.12 + (84200 - 39475) * 0.22 + (160725 - 84200) * 0.24 + (204100 - 160725) * 0.32 + (income - 204100) * 0.35;
			}
			else {
				tax = 9700 * 0.1 + (39475 - 9700) * 0.12 + (84200 - 39475) * 0.22 + (160725 - 84200) * 0.24 + (204100 - 160725) * 0.32 + (306175 - 204100) * 0.35 + (income - 306175) * 0.37;
			}
		}
		else {
			System.out.println("Error: invalid status!");
			System.exit(1);
		}
		System.out.println("Tax: " + (int)tax);
	}
}