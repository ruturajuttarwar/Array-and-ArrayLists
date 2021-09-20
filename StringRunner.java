package array.in28minutes;

public class StringRunner {

	public static void main(String[] args) {
		String[] weekNames = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		String stringlength = "";
		int stringlengthinteger = 0;
		for (String days : weekNames) {
			if (days.length() > stringlength.length()) {
				stringlength = days;
				stringlengthinteger = days.length();
			}
		}
		System.out.println("day with highest charactors " + stringlength);
		System.out.println("highest letters " + stringlengthinteger);

		for (int i = weekNames.length - 1; i >= 0; i--) {
			System.out.println(weekNames[i]);
		}
	}
}
