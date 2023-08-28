package discussion;

import java.lang.*; // by default
import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		
		
		Scanner keybord = new Scanner(System.in);
		
		System.out.print("Enter input: ");
		
//		int num1 = keybord.nextInt();
		
//		double val1 = keybord.nextDouble();
		
//		String sentance = keybord.next();
		
//		char gender = keybord.next().charAt(4);
		
//		String sentance = keybord.nextLine();
		
		/*
		System.out.print("Enter virat statement : ");
		String statementVirat = keybord.nextLine();
		
		System.out.print("Enter rohit statement : ");
		String statementRohit = keybord.nextLine();
		
		*/
		
		keybord.nextLine();
		
		char gender = keybord.next().charAt(0);
		char firstword = keybord.next().charAt(0);
		
		
		System.out.println("User input is: "+ gender +" And "+ firstword);
		
		keybord.close(); //args. this is very importent
		
	}
}
