import java.util.Scanner;
public class Lab02_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter time zone offset: ");
		long timeOffset = input.nextLong();
		long totalMillisSeconds = System.currentTimeMillis();
		long totalSeconds = totalMillisSeconds / 1000;
		long totalMinutes = totalSeconds / 60;
		long currentSeconds = totalSeconds % 60;
		long totalHours = totalMinutes / 60;
		long currentMinutes = totalMinutes % 60;
		long currentHour = (totalHours + timeOffset) % 24;
		System.out.println(currentHour + ":" + currentMinutes + ":" + currentSeconds);
		input.close();
	}

}
