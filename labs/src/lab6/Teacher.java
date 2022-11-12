package lab6;

public class Teacher extends Person{
	
	private int numCourses;
	private String[] courses;
	
	public Teacher(String name, String address) {
		super(name, address);
		numCourses = 0;
		courses = new String[0];
	}
	
	public boolean addCourse(String course) {
		
		
		return true;
		
	}
	
	public boolean removeCourse(String course) {
		
		return true;
		
	}

}
