package defaultaccessmodifier;

public class Main {
	
	public void publicMsg() {
		System.out.println("Called Main-> publicMsg(): public");
	}
	private void msg() {
		System.out.println("Called Main-> msg(): private");
	}
	
	public static void main(String[] args) {
		
		DemoClass1 demo1 = new DemoClass1();
		demo1.msg();
		int y = demo1.x;
		System.out.println(y);
		
		//
		Main main = new Main();
		main.msg();
		
	}
}
