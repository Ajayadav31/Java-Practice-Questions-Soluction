package constructor;

public class Info {
	public static void main(String[] args) {
		
		VoterInfo type1 = new VoterInfo("Ajay");
		System.out.println(type1.getName());
		
		VoterInfo type2 = new VoterInfo("Ajay", 18 );
		System.out.println(type2.getName()+ " "+type2.getAge());
		
		VoterInfo type3 = new VoterInfo("Ajay", 18 , "Dharmendra");
		System.out.println(type3.getName()+ " "+type3.getAge()+ " " +type3.getFatherName());
		
		VoterInfo type4 = new VoterInfo("Ajay", 18 , "Dharmendra", "BAbita");
		System.out.println(type4.getName()+ " "+type4.getAge()+ " " +type4.getFatherName()+ " " +type4.getMotherName());
	}

}
