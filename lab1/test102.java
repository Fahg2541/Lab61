import java.util.Scanner;
public class test102 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int celsius;
		double fahrenheit;
		
		System.out.println("Enter a degree in Celsius : ");
		celsius = in.nextInt();
		
		fahrenheit = (double)(9 / 5.0) *celsius + 32;
		
		System.out.print(+celsius);
		System.out.print("elsius is " +fahrenheit);
		System.out.print("Fahrenheit");

	}

}
