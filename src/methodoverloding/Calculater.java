package methodoverloding;

public class Calculater {
	
	private int num1; // 120
	private int num2; // 76
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	public int add(int num1) {
		int result = num1 + 0;
		return result;
	}
	public double add(double num2) {
		double result = num2 + 0.0;
		return result;
	}
	public double add(int num1, double num2) {
		double result = num1 + num2;
		return result;
	}
	public double add(double num2, int num1) {
		double result = num1 + num2;
		return result;
	}
	
//	public int add(){
//		System.out.println("ui");
//	}
//
//	public double add(){
//		System.out.println("io");
//	}
	
	

}
