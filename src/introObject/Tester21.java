package introObject;


class Test{
	//properitys
	
		public int num1;
		public int num2;
		private String message = "My message!";
		
		// methods
		
		public void printlnOfSum() {
			System.out.println("Println called!");
			sumOfTwoNumbers();
			System.out.println(this.message);
		}
		
		private void sumOfTwoNumbers() {
			int a = this.num1;
			int b = this.num2;
			int result = num1 + num2;
			System.out.println("Sum is: "+ result);
		}
		
}

public class Tester21 {
	
	//properitys
	
	public int num1;
	public int num2;
	private String message = "My message!";
	
	// methods
	
	public void printlnOfSum() {
		System.out.println("Println called!");
	}
	
	private void sumOfTwoNumbers() {
		int a = this.num1;
		int b = this.num2;
		int result = num1 + num2;
		System.out.println("Sum is: "+ result);
	}
	
	public static void main(String[] args) {
		
		Test test = new Test();
		test.num1 = 34;
		test.num2 = 78;
		System.out.println(test.num1 + " "+ test.num2);
//		System.out.println(test.message); // Error
		
		test.printlnOfSum();
//		test.sumOfTwoNumbers();
		
		/*
		Tester21 testerxyz = new Tester21();
		
		testerxyz.num1 = 10;
		testerxyz.num2 = 20;
		System.out.println(testerxyz.num1 + " "+ testerxyz.num2);
		System.out.println(testerxyz.message);
		
		testerxyz.printlnOfSum();
		testerxyz.sumOfTwoNumbers();
		*/
		
	}
}
