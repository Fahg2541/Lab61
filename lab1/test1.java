import java.util.Scanner;
public class test1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number1, number2, number3;
		double avg;
		
		System.out.println("Number is : ");
		number1 = in.nextInt();
		number2 = in.nextInt();
		number3 = in.nextInt();
		
		avg = (double)(number1 + number2 + number3) / 3.0;
		
		System.out.println("Average : " +avg);
		
		

	}

}
