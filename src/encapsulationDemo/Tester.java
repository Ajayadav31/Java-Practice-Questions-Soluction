package encapsulationDemo;

// publc -> accessible from anyware in the project = project
// default -> accessible in the same package = package
// proctected -> accessible in the same file = file 
// private -> accessible in witin the class = witin the class

class Human{
	// props - data 
	// data security - enc
	// data hiding - 
	private String name = "Akash Yadav";
	private String contactNumber = "713957359";
	
	// behavours - methods
	
	public String getName() {
		return name;
	}
	
	public String getContactNumber() {
		return contactNumber;
	}
	
}

class Animal{
	
}

public class Tester {
	
	public static void main(String[] args) {
		Human akash = new Human();
		akash.getName();
		akash.getContactNumber();
	}

}
