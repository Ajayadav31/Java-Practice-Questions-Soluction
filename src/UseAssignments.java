

class Assignment{
	
	private String subject;
	private String submittedBy;
	private String submittedTo;
	private int numberOfPages;
	
	//Setters
	
	public void setSubject( String subject ) {
		this.subject = subject;
	}
	
	public void setSubmittedBy( String submittedBy) {
		this.submittedBy = submittedBy;
	}
	
	public void setSubmittedTo( String submittedTo) {
		this.submittedTo = submittedTo;
	}
	
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
	//Getter
	
	public String getSubject() {
		return this.subject;
	}
	public String getSubmittedBy() {
		return this.submittedBy;
	}
	public String getSubmittedTo() {
		return this.submittedTo;
	}
	public int getNumberOfPages() {
		return this.numberOfPages;
	}
}

public class UseAssignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating object
		
		Assignment xyz = new Assignment();
		
		xyz.setSubject("computer");
		xyz.setSubmittedTo("Akash");
		xyz.setSubmittedBy("Ajay");
		xyz.setNumberOfPages(40);
		
		System.out.println(xyz.getSubject());
		System.out.println(xyz.getSubmittedBy());
		System.out.println(xyz.getSubmittedTo());
		System.out.println(xyz.getNumberOfPages());

		
	}

}