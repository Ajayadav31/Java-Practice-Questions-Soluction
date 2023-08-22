package assigenments;

class Demo89{
	
	private String almeera = "Shirt";
	
	public void callMe() {
		// write code
		
	}
	
	 private void myShirt() {
		System.out.println(this.almeera);
	}
}

public class Date_03_08_23 {
	
	public String cityname = "Bhopal";
	private int citycode = 04;
	private int cityarea = 6357;
	
	public void District() {
		System.out.println(this.cityname);
	}
	
	public void District1() {
		System.out.println(this.citycode);
		System.out.println(this.cityarea);
	}
	
	public static void main(String[] args) {

		Date_03_08_23 Display = new Date_03_08_23();
		Display.District();
		Display.District1();

		
		// task-1
		
		Demo89 demo89 = new Demo89();
		
		demo89.callMe();
		
		// task-2
		
		

	}
}

