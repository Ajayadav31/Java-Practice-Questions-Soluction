package assigenments;

public class Elector_card {
	
	public String ElectorName = "Ajay";
	public int DOB = 31_07_2005;
	private String AssemblyName = "Huzur";
	private String CardNumber = "ADD144657";
	
	public void publicInfo() {
		System.out.println(this.ElectorName);
		System.out.println(this.DOB);
	}
	
	public void privateInfo() {
		System.out.println(this.AssemblyName);
		System.out.println(this.CardNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Elector_card elector = new Elector_card();
		elector.publicInfo();
		elector.privateInfo();
	}

}
