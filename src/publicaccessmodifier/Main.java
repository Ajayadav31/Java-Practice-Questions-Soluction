package publicaccessmodifier;

import demopackage.*;
// sol of accessing the methods of class->main 
import demopackage.MyClass;

public class Main {
	public static void main(String[] args) {
//		System.out.println("Hello, World!");
		Demo1 demo1 = new Demo1();
		demo1.publicMsg();
		
		// outside the package
		Example example = new Example();
		example.publicMsg();
		
		Main demopackage = new Main();
//		demopackage.main(args);
		
		// we can't able t create a object of the class which has main method
		MyClass.main(args);
//		MyClass.publicMsg(); // WE CAN'T ABLE TO ACCESS NON-STATIC METHODS
		MyClass myclass = new MyClass();
		myclass.publicMsg();
		
	}
}
