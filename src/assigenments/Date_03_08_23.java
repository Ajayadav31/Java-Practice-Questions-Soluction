package assigenments;

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
	}
}
