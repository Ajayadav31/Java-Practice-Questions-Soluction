package constructor;

public class Emp {
	
	private String name;
	
	
	private Emp(String name) {
		this.name = name;
		System.out.println("Constructor run");
	}
	
	public static void main(String[] args) {
		
		Emp emp = new Emp("Microsoft-emp");
	
	}
	
}
