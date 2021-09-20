package array.in28minutes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(String name, int... marks) {
		this.name = name;
		for (int mark : marks) {
			this.marks.add(mark);
		// TODO Auto-generated constructor stub
	}
}

	public int getNumberOfMarks() {

	return marks.size();
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum = sum + mark;
		}

		return sum;
	}

	public int getMaximunMark() {
		return Collections.max(marks);

		}



	public int getMinimunMark() {
		return Collections.min(marks);
	}

	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();
		BigDecimal average = (new BigDecimal(sum)).divide(new BigDecimal(number), 3, RoundingMode.UP);
		return average;
	}
@Override
public String toString() {
	return name + marks;

}

public void addNewMark(int mark) {
	marks.add(mark);
	// TODO Auto-generated method stub

}

public void removeMarkAtIndex(int index) {

	marks.remove(index);
	// TODO Auto-generated method stub

}
}
