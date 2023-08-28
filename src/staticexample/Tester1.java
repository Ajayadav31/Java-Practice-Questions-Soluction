package staticexample;

/*
 * clas sloader loads the class in our case it is Demo1
 * then props and static block runes
 * then from the main method we called static methods for getting data
 */

class Demo1{
	
	 private static String name;
	 private int age;
	
	// static block
	static {
		Demo1.name = "Acer";
		System.out.println("Static block!");
	}
	
	public static void setName(String name) {
		Demo1.name = name;
	}
	public static String getName() {
		return Demo1.name;
	}
	
	// for age
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}

}

public class Tester1 {
	
	
	public static void main(String[] args) {
		
		Demo1.setName("Lenovo Yoga");
		String laptopName = Demo1.getName();
		
		System.out.println(laptopName);
		
	}
}
