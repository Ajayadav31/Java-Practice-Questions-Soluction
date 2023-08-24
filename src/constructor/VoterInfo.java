package constructor;

public class VoterInfo {
	private String name;
	private String fatherName;
	private String motherName;
	private int age;
	private int pinCode;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
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
	public VoterInfo(String name, int age, String fatherName) {
		this.name = name;
		this.age = age;
		this.fatherName = fatherName;
	}
	public VoterInfo(String name, int age, String fatherName, String motherName) {
		this.name = name;
		this.age = age;
		this.fatherName = fatherName;
		this.motherName = motherName;
	}
	public VoterInfo(String name, int age, String fatherName, String motherName, int pinCode) {
		this.name = name;
		this.age = age;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.pinCode = pinCode;
	}
	
	
	

}
