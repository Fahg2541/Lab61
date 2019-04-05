import java.util.Scanner;
public class test602 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] number = new int[10];
		int num = 0, max = 0;
		
		System.out.print("Enter number : ");
		for(int i = 0; i < number.length; i++) {
			num = in.nextInt();
			number[i] = num;
			if(number[i] > max) {
				max = number[i];
			}
		}
		
		System.out.print("Max is : " +max);
	}

}
