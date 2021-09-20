package array.in28minutes;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		Student student = new Student("Ruturaj", new int[] { 96, 45, 56, 67, 99, 100 });

		int number = student.getNumberOfMarks();
		System.out.println("Number of marks are " + number);
		int sum = student.getTotalSumOfMarks();
		System.out.println("Sum of marks " + sum);
		int maximumMark = student.getMaximunMark();
		System.out.println("Maximum marks " + maximumMark);
		int minimunMark = student.getMinimunMark();
		System.out.println("Minimum marks " + minimunMark);
		BigDecimal average = student.getAverageMarks();
		System.out.println("Average is " + average);
		System.out.println(student);
		student.addNewMark(35);
		System.out.println(student);
		student.removeMarkAtIndex(5);
		System.out.println(student);
		

	}

}
