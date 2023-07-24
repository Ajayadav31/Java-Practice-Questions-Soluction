package classes.objects;


class Human{
	// properites
	
	String name;
	int height;
	String dob;
	String adhaarNumer;
	String education;
	
	// behaviours || Methods
	public void talking(){
		System.out.println("Sammer's behavious");
	}
	public void studying(){
		System.out.println("Sammer's behavious");
	}
	public void walking(){
		System.out.println("Sammer's behavious");
	}
}

class City1{
	
	// pro
	String cityName;
	int areaCode;
	Boolean isClean;
	
	// methods
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(int areaCode) {
		this.areaCode = areaCode;
	}
	public Boolean getIsClean() {
		return isClean;
	}
	public void setIsClean(Boolean isClean) {
		this.isClean = isClean;
	}
	
}


class Dog{
	
	int age = 4;
	String name = "robbin";
	double weight = 18;
	
	// methods
	public int getAge() {
		return this.age;
	}
	public double getWeight() {
		return this.weight;
	}
	public String getName() {
		return this.name;
	}
}


public class Tester {
	// properties;
	// X
	
	// methods
	
	public static void main(String[] args) {
		
//		Dog robin = new Dog();
//		
//		int age = robin.getAge();
//		
//		System.out.println(age);
		
//		System.out.println(robin.getAge());
//		System.out.println(robin.getName());
//		System.out.println(robin.getWeight());
		
//		Human ajay = new Human();
//		
//		ajay.talking();
//		ajay.walking();
//		ajay.studying();
		
		
		City1 bhopal = new City1();
		
		bhopal.setCityName("Bhopal");
		bhopal.setAreaCode(462042);
		bhopal.setIsClean(true);
		
		System.out.println(bhopal.getCityName());
		System.out.println(bhopal.getAreaCode());
		System.out.println(bhopal.getIsClean());
		
		
		
//		String cityName = bhopal.getCityName();
//		int areaCode = bhopal.getAreaCode();
//		Boolean isClen = bhopal.getIsClean();
//		
//		System.out.println(cityName + " " + areaCode + " " + isClen);
	}
}
