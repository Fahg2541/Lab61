import java.util.Scanner;
public class test302 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int old;
		char sex;
		
		System.out.println("How old are you ? : ");
		old = in.nextInt();
		System.out.println("Are you male or female (M,F) ?  ");
		sex = in.next().charAt(0);
		
		if(old > 50) {
			System.out.println("You are a senior citizen");
			System.out.println("Enjoy old age ");
		}
		else if (old <= 50 && old >=31 ){
			System.out.println("You are a middle age ");
			System.out.println("Please work hard ");
		}
		else if(old <= 30 && old >= 20) {
			System.out.println("You are an adult ");
			System.out.println("Have fun in college ");
		}
		else if(old <= 19 && old >= 13) {
			System.out.println("You are a teenage ");
			System.out.println("Stay away from drugs ");
		}
		else {
			System.out.println("You are a youth");
		}

	}

}
