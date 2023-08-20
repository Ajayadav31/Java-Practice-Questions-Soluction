package introObject;


class House{
	
	private String almeera = "Shirts";
	
	public void arpit() {
		System.out.println(this.almeera);
	}
}

public class HelloTester {
	
	public static void main(String[] args) {
		House arpitHouse = new House();
		arpitHouse.arpit();
	}
}	
