
public class Teacher extends Person{
	private int numCourses;
	private String courses[];
	
	public Teacher(String name, String address) {
		super(name, address);
	}
	
	public boolean addCourses(String course[]) {
		return false;
	}
	
	public boolean removeCourses(String course[]) {
		return false;
	}
	
	public String toString() {
		return "";
	}
	
}
