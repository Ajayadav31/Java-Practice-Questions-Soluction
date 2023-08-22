package assigenments;

class Student {
    // Data members (instance variables)
    private String name;
    private int age;
    private String studentId;

    // Constructor
    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    private int getAge() {
        return age;
    }
    
    public int waysOfGetAge() {
    	return this.getAge();
    }

    public String getStudentId() {
        return studentId;
    }

    // Setter methods (Optional, if you want to change the data after object creation)
    public void setName(String name) {
//        @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    	
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // Other methods
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentId);
    }
}


public class Tester {
	
	    public static void main(String[] args) {
	        // Create a Student object
	        Student student1 = new Student("Alice", 20, "S12345");

	        // Display student details
	        student1.displayDetails();

	        // Accessing individual data members using getter methods
	        String studentName = student1.getName();
//	        int studentAge = student1.getAge();
	        
	        // Write code for getting th age 
//	        @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

	        int studentAge = student1.waysOfGetAge();

//	        int studentAge = 

	        
	        
	        
	        
	        String studentId = student1.getStudentId();

	        System.out.println("Name: " + studentName);
//	        System.out.println("Age: " + studentAge);
	        System.out.println("Student ID: " + studentId);
	    }

}
