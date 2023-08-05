package assigenments;

public class Email {
	
	public String emailHolderName = "Ajay Yadav";
	public String emailName = "ajayadav3108@gmail.com";
	private int phoneNumber = 825104874;
	private String password = "XXX-XXX-1234";
	
	public void personalInfo() {
		System.out.println(this.phoneNumber);
		System.out.println(this.password);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Email Account = new Email();
		System.out.println(Account.emailHolderName);
		System.out.println(Account.emailName);
		Account.personalInfo();
	}

}
