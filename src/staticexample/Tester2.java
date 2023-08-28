package staticexample;

class Demo2{
	private static int num1;
	private int num2;
	
	public static int getNum1() {
		return num1;
	}
	public static void setNum1(int num1) {
		Demo2.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int addTwoNumber() {
		int num1 = Demo2.getNum1();
		int num2 = getNum2();
		return num1+num2;
		// in normal methods we can access static props and methods
	}
	public static int addNumer() {
		int num1 = Demo2.getNum1();
		int num2 = 0;
		return num1+num2;
		// we can't access not static feiled in static methods
	}
	public static int addNumber(Demo2 d2) {
		return Demo2.getNum1()+d2.getNum2();
	}
	public void call(int x) {
		System.out.println("called");
	}
}
public class Tester2 {
	
	public static void main(String[] args) {
		
		Demo2.setNum1(10);
		Demo2.addNumer();
		
		Demo2 demo2 = new Demo2();
		
		demo2.setNum2(20);
		demo2.addTwoNumber();
		
		demo2.addNumber(demo2);
		
		demo2.call(23);
	}

}
