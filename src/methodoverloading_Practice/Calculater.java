package methodoverloading_Practice;

public class Calculater {
	
	private int num1;
	private int num2;
	private String text;
	
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
	public String getText() {
		return text;
	}
	public void setText( String text) {
		this.text = text;
	}
	
	public String add(int num1 ,int num2 , String text) {
		String result = num1 + num2 + text;
		return result;
	}
	
	public String add(String text, int num1 , int num2) {
		String result = text+ (num1 + num2);
		return result;
	}
	
	public int add(int num1 , int num2) {
		int result = num1+num2;
		return result;
	}

}
