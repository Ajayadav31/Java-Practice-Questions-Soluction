package methodoverloding;

public class Tester {
	
	int y;
	
	public void x() {
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		// creating method class obj
		Method m = new Method();
		int num1 = m.getNum1();
		int num2 = m.getNum2();
		
		System.out.println(num1 + " " + num2);
		
		m.setNum1(345);
		m.setNum2(8976);
		
		System.out.println(m.getNum1()+ " " + m.getNum2());
		
		int x=0;
		System.out.println(x);
		
		Tester t = new Tester();
		t.x();
	}
}
