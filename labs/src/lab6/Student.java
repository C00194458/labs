package lab6;

public class Student extends Person {
	
	private int numCourses;
	private String[] courses;
	private int[] grades;
	
	public Student(String name, String address) {
		
		super(name, address);
		numCourses = 0;
		courses = new String[0];
		grades = new int[0];

	}
	
	public void addCourseGrade(String course, int grade) {
		
	}
	
	public void printGrades() {
		
	}
	
	public double getAverageGrade() {
		
		double total = 0;
		
		return total;
	}
	
}

