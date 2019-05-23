public class Student extends Person{
	private int numCourses;
	private String courses[];
	private int grades[];
	
	public Student(String name, String address) {
		super(name, address);
	}
	
	public void addCourses(String courses[], int grades[]) {
		this.courses = courses;
		this.grades = grades;
	}
	
	public double getAverageGrade() {
		int sum = 0;
		for (int i = 0; i < this.grades.length; i++ ) {
			sum += this.grades[i];
		}
		sum = sum/numCourses;
		return sum;
	}
	
	public void printGrades() {
		String s;
		s = "" +getAverageGrade();
	}
	
	public String toString() {
		return "";
	}

}
