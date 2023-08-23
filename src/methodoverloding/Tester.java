package methodoverloding;

public class Tester {
//	
//	int y;
//	
//	public void x() {
//		System.out.println(y);
//	}
	
	public static void main(String[] args) {
		
		
		Calculater cal = new Calculater();
		cal.setNum1(120);
		cal.setNum2(76);
		
		System.out.println(cal.getNum1()+" "+cal.getNum2());
		
		int num1 = cal.getNum1();
		int num2 = cal.getNum2();
		
		int result = cal.add(num1,num2);
		System.out.println(result);
		
		
		// creating method class obj
//		Method m = new Method();
//		int num1 = m.getNum1();
//		int num2 = m.getNum2();
//		
//		System.out.println(num1 + " " + num2);
//		
//		m.setNum1(345);
//		m.setNum2(8976);
//		
//		System.out.println(m.getNum1()+ " " + m.getNum2());
//		
//		int x=0;
//		System.out.println(x);
//		
//		Tester t = new Tester();
//		t.x();
	}
}
