import java.util.Scanner;

public class TeatGraduationStudent {

	public static void main(String[] args) {
		CollegeStudent s1 = new CollegeStudent();
		CollegeStudent s2 = new CollegeStudent();
		Scanner in = new Scanner (System.in);
		
		
		System.out.println("Firstname : ");
		String fn1 = in.next();
		s1.setFirstName(fn1);
		
		System.out.println("Lastname : ");
		String ln1 = in.next();
		s1.setLastName(ln1);
		
		System.out.println("enrollment Month : ");
		String em1 = in.next();
		
		System.out.println("enrollment Day : ");
		String ed1 = in.next();
		
		System.out.println("enrollment year : ");
		String ey1 = in.next();
		s1.setEnrollmentDate(ed1,ey1, em1);
		
		System.out.println("Firstname : ");
		String fn2 = in.next();
		s2.setFirstName(fn2);
		
		System.out.println("Lastname : ");
		String ln2 = in.next();
		s2.setLastName(ln2);
		
		System.out.println("enrollment Month : ");
		String em2 = in.next();
		
		System.out.println("enrollment Day : ");
		String ed2 = in.next();
		
		System.out.println("enrollment year : ");
		String ey2 = in.next();
		s2.setEnrollmentDate(ed2, ey2, em2);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());

	}

}
