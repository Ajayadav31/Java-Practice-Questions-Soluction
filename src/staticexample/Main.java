package staticexample;

// static props
// static block
//static methods

class Demo{
	
	 protected static String name;
	
	// static block
	static {
		Demo.name = "Acer";
		System.out.println("Static block!");
	}
	
	// Both the soluction is not right for static -> setter getter , constructor

//	public static String getName() {
//		return name;
//	}
//
//	public static void setName(String name) {
//		Test.name = name;
//	}
	
//	public Test(String name) {
//		this.name = name;
//	}
	
}

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Hello, World!");
		System.out.println("120 lines of code");
		
		String name = Demo.name;
		
		System.out.println(name);
	}
}
