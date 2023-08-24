package constructor;

public class VoterInfo {
	private String name;
	private String FatherName;
	private String MotherName;
	private int age;
	private int pinCode;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFatherName() {
		return FatherName;
	}
	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}
	public String getMotherName() {
		return MotherName;
	}
	public void setMotherName(String motherName) {
		MotherName = motherName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	
	public VoterInfo(String name) {
		this.name = name;
	}
	public VoterInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public VoterInfo(String name, int age, String FatherName) {
		this.name = name;
		this.age = age;
		this.FatherName = FatherName;
	}
	public VoterInfo(String name, int age, String FatherName, String MotherName) {
		this.name = name;
		this.age = age;
		this.FatherName = FatherName;
		this.MotherName = MotherName;
	}
	public VoterInfo(String name, int age, String FatherName, String MotherName, int pinCode) {
		this.name = name;
		this.age = age;
		this.FatherName = FatherName;
		this.MotherName = MotherName;
		this.pinCode = pinCode;
	}
	
	
	

}
