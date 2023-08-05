package assigenments;

public class Human {
	
	public String name = "Sameer";
	private int hieght = 06;
	private int age = 18;
	public String address = "Bhopal";
	
	
	public void Person() {
		System.out.println(this.hieght);
		System.out.println(this.age);
	}
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human person = new Human();
		
		System.out.println(person.name);
		System.out.println(person.address);
		person.Person();

	}

}
