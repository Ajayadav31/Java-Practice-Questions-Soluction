package assigenments;

public class Result {
	
	public String studentName = "Ajay";
	private int rollNumber = 123456;
	private int applicationNumber = 987654;
	public String grade = "A";

	public void privateInformation() {
		System.out.println(this.rollNumber);
		System.out.println(this.applicationNumber);
	}
	
	public void publicInformation() {
		System.out.println(this.studentName);
		System.out.println(this.grade);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Result info = new Result();
		info.publicInformation();
		info.privateInformation();
	}

}
