import java.util.Scanner;
public class DisplayTime {
	
	public static void main(String[] args) {
		//Create scanner object and ask user for input then close input scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a seconds amount: ");
		int second = input.nextInt();
		input.close();
		
		//Calculating inputed seconds to minutes and getting remainder, and print output
		int minute = second / 60;
		int remainSecond = second % 60;
		System.out.println(second + " seconds is " + 
		minute + " minutes and " + remainSecond + " seconds ");
	}
	
}