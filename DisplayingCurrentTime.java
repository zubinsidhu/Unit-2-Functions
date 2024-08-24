
public class DisplayingCurrentTime {

	public static void main(String[] args) {
		long totalMillisSeconds = System.currentTimeMillis();
		long totalSeconds = totalMillisSeconds / 1000;
		long totalMinutes = totalSeconds / 60;
		long currentSeconds = totalSeconds % 60;
		long totalHours = totalMinutes / 60;
		long currentMinutes = totalMinutes % 60;
		long currentHour = totalHours % 24;
		System.out.println(currentHour + ":" + currentMinutes + ":" + currentSeconds);
	}

}
