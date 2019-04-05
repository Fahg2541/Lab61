import java.util.Scanner;
public class test6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double[] num = new double[10];
		double n = 0, avg = 0,sum = 0;
		
		System.out.print("Enter number : ");
		for(int i = 0; i < num.length ; i++) {
			n = in.nextInt();
			num[i] = n;
			sum += num[i];
		}
		avg = sum/10; 
		System.out.print("Average : " +avg);
	}

}
