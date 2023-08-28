package discussion;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("    		  WELCOME!			");
		System.out.print("NAME : ");
		String name = in.next();
		System.out.print("Roll Number : ");
		int roll = in.nextInt();
		System.out.print("Stream Code : ");/* PCM-1,PCB-2,Commerce-3*/
		String sub = in.next();
		switch(sub)
		{
			case "PCM" :
				System.out.print("Enter your marks in hindi : ");
				int h = in.nextInt();
				System.out.print("Enter your marks in english : ");
				int e = in.nextInt();
				System.out.print("Enter your marks in maths : ");
				int m = in.nextInt();
				System.out.print("Enter your marks in chemistry : ");
				int c = in.nextInt();
				System.out.print("Enter your marks in physics : ");
				int p = in.nextInt();
				double percent = (h+e+m+c+p)/5;
				System.out.println("Your percentage is : " +percent);
				if(percent>=55) {
					System.out.println("Congrats! You passed");
				}
				else {
					System.out.println("not passed");
				}
				break;
				
			case "BIO":
				System.out.print("Enter your marks in hindi : ");
				int hi = in.nextInt();
				System.out.print("Enter your marks in english : ");
				int en = in.nextInt();
				System.out.print("Enter your marks in Biology : ");
				int b = in.nextInt();
				System.out.print("Enter your marks in chemistry : ");
				int ch = in.nextInt();
				System.out.print("Enter your marks in physics : ");
				int py = in.nextInt();
				double percent2 = (hi+en+b+ch+py)/5;
				System.out.println("Your percentage is : " +percent2);
				if(percent2>=55) {
					System.out.println("Congrats! You passed");
				}
				else {
					System.out.println("not passed");
				}
				break;
				
			case "Comm" :
				System.out.print("Enter your marks in hindi : ");
				int hin = in.nextInt();
				System.out.print("Enter your marks in english : ");
				int Eng = in.nextInt();
				System.out.print("Enter your marks in Bussines : ");
				int Bus = in.nextInt();
				System.out.print("Enter your marks in Account : ");
				int Acc = in.nextInt();
				System.out.print("Enter your marks in Economy : ");
				int Eco = in.nextInt();
				double percent3 = (hin+Eng+Bus+Acc+Eco)/5;
				System.out.println("Your percentage is : " +percent3);
				if(percent3>=55) {
					System.out.println("Congrats! You passed");
				}
				else {
					System.out.println("not passed");
				}
				break;
		}
		
	}

}
