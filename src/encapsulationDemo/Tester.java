package encapsulationDemo;

// publc -> accessible from anyware in the project = project
// default -> accessible in the same package = package
// proctected -> accessible in the same file = file 
// private -> accessible in witin the class = witin the class

class Animal{
	// props
	private String name = "Akash Yadav";
	private String contactNumber = "6261898314";
	
	// behavours
	
}

class Human{
	
}

public class Tester {
	
	public static void main(String[] args) {
		Animal robbin = new Animal();
		robbin.name = "asas";
	}

}
