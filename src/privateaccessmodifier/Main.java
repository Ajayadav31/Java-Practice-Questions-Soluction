package privateaccessmodifier;

class Demo{
	private String name="Swift-3";
	
	private void print() {
		System.out.println(this.name);
	}
	protected void printMsg() {
		System.out.println("name is "+this.name);
	}
	public void msg() {
		System.out.println("called Demo->msg(): public");
	}
}

public class Main {
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.msg();
		demo.printMsg();
	}
}

