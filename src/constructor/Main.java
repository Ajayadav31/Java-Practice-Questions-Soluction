package constructor;

public class Main {
	public static void main(String[] args) {
	
		Employee emp1 = new Employee("Yuvraj", 43,"Infy100769", 670000.98);
		
		System.out.println(emp1.getName()+" "+emp1.getEmpN0());
		
		Employee emp2 = new Employee("Om-kar", 23);
		Employee emp3 = new Employee(8976);
		Employee emp4 = new Employee("floppy", 56.87, 76);
		
		
		
		
//		Emp emp = new Emp("Google-emp");
		
	}
}
