import java.util.Scanner;
public class test402 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number; 
		double sum=0;
		
		System.out.println("Enter number : ");
		//number = in.nextInt();
		
		for (int i= 0 ;i < 10; i++ ) {
			number = in.nextInt();
			sum=(double)sum+number;			
		}
		
		System.out.println("AVG : " + (sum/10.0));

	}
}
