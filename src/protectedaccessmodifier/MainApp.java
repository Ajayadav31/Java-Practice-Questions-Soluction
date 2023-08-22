package protectedaccessmodifier;

import protecteddemo.Example;

public class MainApp extends Example {
	public static void main(String[] args) {
//		System.out.println("Hello, World!");
		Example.main(args);
		Example example = new Example();
		
		MainApp app = new MainApp();
		app.msg();
		app.demo();
				
	}
}
