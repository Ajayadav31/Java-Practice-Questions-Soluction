package takinginputfromuser;
import java.util.Scanner;

/*here java.util is a package which have Scanner Class that uses to take input from user
 * this is pre defined program
 */

public class Add {
	public static void main(String[] args) {
		    Scanner in = new Scanner(System.in); 
			/*Scanner class object creation ke time [System.in]leti hai
			 * System,in me System Class hai & in input lene ki method hai */
			System.out.print("Enter num1 : ");
			int num1 = in.nextInt();
			System.out.print("Enter num2 : ");
			int num2 = in.nextInt();
			
			int result = num1 + num2;
			System.out.print("Addition of " +num1+ " and " +num2+ " is : " +result);
		
	}
}
