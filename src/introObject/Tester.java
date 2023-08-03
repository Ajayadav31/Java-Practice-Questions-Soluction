package introObject;

class Myprograms{
	
	// properitys
	
	// methods
	
	public void addTwoNumbers(int num1, int num2) {
		
		int result = num1 + num2;
		System.out.println("Sum of 2 numbers is: "+ result);
		
	}
}



public class Tester {
	public static void main(String[] args) {
		
		Myprograms programs = new Myprograms();
		
		programs.addTwoNumbers(12, 56);
		
	}
}
