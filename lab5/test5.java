import java.util.Scanner;
public class test5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int score1;
		
		System.out.println("Enter score : ");
		score1 = in.nextInt();
		
		calGrade(score1);
	}
		
		public static void calGrade(int score) {
			
			char grade;
			if(score >= 80) {
				grade = 'A';
			}
			else if(score >=70) {
				grade = 'B';
			}
			else if(score >=60) {
				grade = 'C';
			}
			else if(score >=50) {
				grade = 'D';
			}
			else {
				grade = 'F';
			}
			
			System.out.print(grade);
			
		}
}
