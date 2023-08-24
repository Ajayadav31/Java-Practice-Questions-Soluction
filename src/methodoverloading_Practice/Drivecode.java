package methodoverloading_Practice;

public class Drivecode {
	public static void main(String[] args) {
		
		Calculater cal = new Calculater();
		cal.setNum1(90);
		cal.setNum2(10);
		cal.setText("Your answer");
		
		System.out.println(cal.getNum1()+ " "+cal.getNum2());
		

		int num1 = cal.getNum1();
		int num2 = cal.getNum2();
		String text = cal.getText();
		
		String result = cal.add(text , num1, num2);
		System.out.println(result);
		
    	int result1 = cal.add(num1, num2);
		System.out.println(result1);
		
		String result2 = cal.add(num1, num2, text);
		System.out.println(result2);
		
	}

}
