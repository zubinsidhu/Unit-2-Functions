//Import java utility for scanner
import java.util.Scanner;
public class ConvertingTemperature {

	public static void main(String[] args) {
		//Create scanner object, ask for input, and set input as double fahrenheit variable
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Temperature in Fahrenheit: ");
		double fahrenheit = input.nextInt();
		input.close();
		
		//set double celsius variable to equal equation, then print output
		double celsius = 5.0/9.0 * (fahrenheit - 32);
		System.out.println(fahrenheit + " degrees fahrenheit is " + celsius + " degrees celsius ");
	}

}
