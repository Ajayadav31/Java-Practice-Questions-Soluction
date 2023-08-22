package staticexample;

import demo1.Main;

class Test{
	int x = 19;
	
	public static void print() {		
		System.out.println("Print Somthing.....");
	
	}
}

public class Tester {
	static int x = 10;
	
	public void doSomthin() {
		x = 12;
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		
		Tester tester = new Tester();
		tester.doSomthin();
		
		System.out.println("Hello, World");
//		
//		Test test = new Test();
//		test.print();
		
		Test.print();
		
	}
	
}


// Rules for static

