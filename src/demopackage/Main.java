package demopackage;

class Test{
	public String className = "Public Test";
	
	public void publicMsg() {
//		int x = 10;
		System.out.println("Called Test-> PublicMsg(): public");
	}
}

public class Main {
	
	public void publicMsg() {
//		int x = 10;
		System.out.println("Called Main-> PublicMsg(): public");
	}
	
	public static void main(String[] args) {
		int demoVariable = 23;
		
		//
		Main main = new Main();
		main.publicMsg();
		//
		Test test = new Test();
		test.publicMsg();
		String name = test.className;
		System.out.println(name);
	}
}
