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
	

	private void printSomthing() {
		System.out.println("Hello, OWrld");
	}

	
}



public class Tester {
	
	public void addTwoNumbers(int num1, int num2) {
			
			int result = num1 + num2;
			System.out.println("Sum of " +num1+ " and " +num2+ " is:" +result);
			
		}

	private void printSomthing() {
		System.out.println("Hello, OWrld");
	}
	
	
	public static void main(String[] args) {
		
		Tester tester = new Tester();
		tester.printSomthing();
		
		Myprograms programs = new Myprograms();

		//programs.printSomthin();

//		programs.printSomthin();

		
		/*
		 
		
		Tester tester = new Tester();
		tester.addTwoNumbers(23, 45);
		tester.printSomthing();
		
		// *************************************************************
		
	
		Myprograms programs = new Myprograms();
		
		programs.addTwoNumbers(12, 56);
		programs.subTwoNumbers(12, 5);
		programs.multTwoNumbers(12, 23);
		programs.diviTwoNumbers(35, 7);
<<<<<<< HEAD
=======
//		programs.printSomthin(); // ERROR
		
	 */

		
	}
}