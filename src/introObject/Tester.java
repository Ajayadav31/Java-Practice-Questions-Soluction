package introObject;

class Myprograms{
	
	// properitys
	
	// methods
	
	public void addTwoNumbers(int num1, int num2) {
		
		int result = num1 + num2;
		System.out.println("Sum of " +num1+ " and " +num2+ " is:" +result);
		
	}
	
	public void subTwoNumbers(int num1, int num2) {
		
		int result = num1 - num2;
		System.out.println("Substraction of " +num1+ " and " +num2+ " is:" +result);
	}
	public void multTwoNumbers(int num1, int num2) {
		
		int result = num1 * num2;
		System.out.println("Multiplication of " +num1+ " and " +num2+ " is:" +result);
	}
	public void diviTwoNumbers(int num1, int num2) {
		
		int result = num1 / num2;
		System.out.println("Division of " +num1+ " and " +num2+ " is:" +result);
	}
	
	
}



public class Tester {
	public static void main(String[] args) {
		
		Myprograms programs = new Myprograms();
		
		programs.addTwoNumbers(12, 56);
		programs.subTwoNumbers(12, 5);
		programs.multTwoNumbers(12, 23);
		programs.diviTwoNumbers(35, 7);
		
	}
}
