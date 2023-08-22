package demo.public1;

import demo1.Tester;
import demo1.Test;

public class Main {
	public static void main(String[] args) {
		Tester.main(args);
		
		Test test = new Test();
		test.setName("Hp");
		test.getName();
		
		Test.main(args);
		test.main(args);
	}
}
