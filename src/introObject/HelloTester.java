package introObject;


class House{
	
	private String almeera = "Shirts";
	
	public void sameer() {
		System.out.println(this.almeera);
	}
}

public class HelloTester {
	
	public static void main(String[] args) {
		House house = new House();
		house.sameer();
	}
}	
