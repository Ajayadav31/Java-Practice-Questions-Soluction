package publicaccessmodifier;

import package1.Test;
import package1.MyClass;
import package1.Laptop;


public class Tester {
	public static void main(String[] args) {


		String status = "Yes";
		Test test = new Test();
		MyClass myclass = new MyClass();
		Laptop laptop = new Laptop();
		
		Test.main(args);
		test.getName();
		myclass.printSomething();
		laptop.calTotalPrice();
		laptop.msg();
		myclass.myStatus(status);
		
	}
}


		
		