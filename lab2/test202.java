import java.util.Scanner;
public class test202 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number;
		
		System.out.println("Number is : ");
		number = in.nextInt();
		
		if(number >= 10) {
			System.out.println("Equal Or More 10 ");
		}
		else {
			System.out.println("No equal 10 ");
		}

	}

}