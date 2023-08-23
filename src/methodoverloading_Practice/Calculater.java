package methodoverloading_Practice;

public class Calculater {
	
	private int num;
	private String text;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getText() {
		return text;
	}
	public void setText( String text) {
		this.text = text;
	}
	
	public void add(String text , int num) {
		String result = num + " " text;
	}

}
