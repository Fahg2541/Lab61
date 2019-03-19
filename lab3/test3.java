import java.util.Scanner;
public class test3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char grade;
		int number = 0;
		
		System.out.println("Please Enter Grade : ");
		grade = in.next().charAt(0);
		
		
		switch (grade) {
		case 'A': number = 4; break;
		case 'B': number = 3; break;
		case 'C': number = 2; break;
		case 'D': number = 1; break;
		case 'F': number = 0; break;
		
	}
		System.out.println("Grade value : " +number);

	}

}
