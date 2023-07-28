package setter.getter;


class Mobile{
	// prop
//	<access_modifier> <data_Type> <property_name>
	
	private String mobModelNumber;
	private String mobCompneyName;
	private String mobColor;
	private int mobPrice;
	
	// methods
//	<access_modifier> <return_type> <method_name> ( <args> ) { };
	
	// rules to write name of the methods
	// camel case -> sameerKumarYadav , ajayYadav, mujhePaniPeenaHai
	// pascal case -> Virat Kolhi, Ajay Yadav, My Laptop
	// lower case -> anjinkay rahane, rohit sharma
	// UPPERCASE -> HARDIK PANDAYA, SHUBMAN GILL
	
	
	// setters
	public void setMobModelNumber(String mobModelNumber) {
		this.mobModelNumber = mobModelNumber;
	}
	
	public void setMobCompneyName(String mobCompneyName) {
		this.mobCompneyName = mobCompneyName;
	}
	public void setMobColor( String mobColor) {
		this.mobColor = mobColor;
	}
	public void setMobPrice(int mobPrice) {
		this.mobPrice = mobPrice;
	}
	
	// gettters
	
	public String getMobModelNumber() {
		return this.mobModelNumber;
	}
	
	public String getMobCompneyName() {
		return this.mobCompneyName;
	}
	
	public String getMobColor() {
		return this.mobColor;
	}
	public int getMobPrice() {
		return this.mobPrice;
	}
	
	
	
	public void showMobDetails( ) {
		// code
	}
	public String  modifiMob( String mobModelNumber) {
		return mobModelNumber;
	}
}

// things to conctacte

// 1. How to make props
// 2. How to make methods
// 3. how to access props from the class using this keyword


// 1. we should make .java file in Pascal case because in java all classes have Pascal case
// 2. we have to define main method in the class same as .java file
// 3. it's recommended to make public which class is contain main methods


public class Tester {
	
	public static void main(String[] args) {
		
		// creating object
		Mobile samsung = new Mobile();
		
		samsung.setMobCompneyName("Samsung");
		samsung.setMobColor("White");
		samsung.setMobModelNumber("S22-Ultra");
		samsung.setMobPrice(1_20_000);
		
		System.out.println( samsung.getMobCompneyName() );
		System.out.println( samsung.getMobColor() );
		System.out.println( samsung.getMobModelNumber());
		System.out.println(samsung.getMobPrice());
		
	}
}
