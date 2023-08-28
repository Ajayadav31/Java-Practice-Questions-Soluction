package takinginputfromuser;
import java.util.Scanner;


public class Name {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String name = in.next();
		System.out.println("your name is : " + name);
		System.out.println("Is this correct(Y/N)");
		char ans = in.next().charAt(0);
		if(ans=='Y') {
			System.out.println("Enter your age :  ");
			int age = in.nextInt();
			if(age>=18) {
				System.out.println("You are Voter");
			}
			else {
				System.out.println("You are not voter because below age");
			}
		}
		else {
			System.out.println("Refresh the page and reenter your name");
		}
	}

}
