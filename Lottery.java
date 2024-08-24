import java.util.*;
public class Lottery {

	public static void main(String[] args) {
		int lottery = (int)(Math.random() * 100);
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (2-digits): ");
		int guess = input.nextInt();
		input.close();
		
		int lotteryD1 = lottery/10;
		int lotteryD2 = lottery%10;
		int guessD1 = guess/10;
		int guessD2 = guess%10;
		System.out.println("The lottery number is: " + lottery);
		if (lottery == guess) {
			System.out.print("Exact match, You win $10,000");
		}
		else if (lotteryD1 == guessD2 && lotteryD2 == guessD1) {
			System.out.print("Match all digits, You win $3,000");
		}
		else if (lotteryD1 == guessD1 || lotteryD1 == guessD2 || lotteryD2 == guessD1 || lotteryD2 == guessD2) {
			System.out.print("Match one digit: You win $1,000");
		}
		else {
			System.out.print("Better luck next time");
		}	
	}

}
