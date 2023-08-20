package demoJava;

class Animal{
	
	public String name;
	private int age;
	private char gender;
	
	// setter getters

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
}

public class Tester {
	
	public static void main(String[] args) {
		
		Animal mydog = new Animal();
		
		
		mydog.setName("robbin");
		mydog.setAge(12);
		mydog.setGender('M');
		
		String name = mydog.getName();
		System.out.println(name);
		
		int age = mydog.getAge();
		System.out.println(age);
		
		char gender = mydog.getGender();
		System.out.println(gender);
		
		
		
		
		Animal youDog = new Animal();
		
		youDog.setName("rubbal");
		youDog.name = "Pappu";
		
		youDog.setAge(3);
		
		System.out.println();
	}

}
