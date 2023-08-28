package staticexample;

class Human{
	
	static {
		System.out.println("Hello from static block!");
	}
}

public class UseMain {
	public static void main(String[] args) throws ClassNotFoundException {
		
		// new Human(); // object creation of human class
		Class.forName("staticexample.Human");
	}
}
