import java.util.Scanner;
public class test502 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int celsius;
		double fahrenheit;
		
		System.out.println("Enter a degree in Celsius : ");
		celsius = in.nextInt();
		
		ChangeTemperature(celsius);
		
	}
		public static void ChangeTemperature(int c) {
		double fahrenheit;
		
		fahrenheit = (double)(9 / 5.0) *c + 32;
		
		System.out.print(c);
		System.out.print("  ");
		System.out.print("celsius is " +fahrenheit);
		System.out.print("  ");
		System.out.print("Fahrenheit");
	}
	

}
