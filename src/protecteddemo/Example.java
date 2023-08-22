package protecteddemo;

class MyClass{
	protected void msg() {
		System.out.println("Called MyClass-> msg():protected");
	}
}

public class Example {
	
	protected void msg() {
		System.out.println("Called MyClass-> msg():protected");
	}
	
	protected void demo() {
		System.out.println("Called MyClass-> demo():protected");
	}
	
	public static void main(String[] args) {
		System.out.println("Example!");
		MyClass myclass = new MyClass();
		myclass.msg();
	}
}
