public class CollegeStudent {
	String firstname;
	String lastname;
	String enrollmentday;
	String graduation;
	String enrollmentmonth;
	String enrollmentyear;
	
	public CollegeStudent() {
		
	}
	
	public String getFirstName() {
		return firstname;
	}
	
	public void setFirstName(String fn) {
		this.firstname = fn;
	}
	
	public String getLastName() {
		return lastname;
	}
	
	public void setLastName(String ln) {
		this.lastname = ln;
	}
	
	public String getEnrollmentDate() {
		return enrollmentday + enrollmentmonth + enrollmentyear;
	}
	
	public void setEnrollmentDate(String ed, String ey, String em) {
		this.enrollmentday = ed;
		this.enrollmentmonth = em;
		this.enrollmentyear = ey;
		
	}
	
	public int getGraduation() {
		int result = Integer.parseInt(this.enrollmentyear);
		return result + 4;
	}
	
	public void setGraduation(String g) {
		this.graduation = g;
	}
	
	public String toString() {
		return "Firstname : " +getFirstName()+ " Lastname : "+getLastName()+ 
				" Enrollment Date : " +getEnrollmentDate()+
				" Graduation Year : " +getGraduation();
	}

}
