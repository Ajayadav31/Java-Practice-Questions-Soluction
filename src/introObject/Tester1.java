package introObject;

class Demo{
	
	private void printSomthing() {
		System.out.println("Hello, From private in main!");
	}
	
	public void printNothing() {
		System.out.println("Hello, From public in main!");
	}
}


public class Tester1 {
	
	private void printSomthing() {
		System.out.println("Hello, From private in main!");
	}
	
	public void printNothing() {
		System.out.println("Hello, From public in main!");
	}
	
	public static void main(String[] args) {
		
		Tester1 sameer = new Tester1();
		sameer.printNothing();
		sameer.printSomthing();
		
		Demo demo = new Demo();
		demo.printNothing();
//		demo.printSomthing();
	}
	
}


// Notes:-

// Accessing the public methods is allowed from enyware

// Accessing the private methods is note allowed from anyware

			// 1. if you try to access private methods from same class then it's correct
			//2. if you try to access private methods from diffrent class thenit's wrong.


