package assigenments;

class ExampleClass {
    public int publicVariable; // This variable can be accessed from any class.

    private int privateVariable; // This variable can only be accessed within this class.

    public ExampleClass() {
        publicVariable = 10;
        privateVariable = 20;
    }

    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    private void privateMethod() {
        System.out.println("This is a private method.");
    }
}

public class Main {
    public static void main(String[] args) {
        ExampleClass obj = new ExampleClass();
        System.out.println(obj.publicVariable); // Output: 10
        obj.publicMethod(); // Output: This is a public method.

        // The following lines will cause compilation errors since private members are not accessible from outside the class.
        // System.out.println(obj.privateVariable);
        // obj.privateMethod();
    }
}





//NOTES:


/*


Public Access Modifier:

When a class, method, or variable is declared as public, it can be accessed from any other class or package in the Java program.
Classes with public access can be instantiated and used by other parts of the program.
Public methods and variables can be accessed directly from outside the class.
Syntax: public


Private Access Modifier:

When a class member (method or variable) is declared as private, it can only be accessed within the same class.
Private methods and variables are not accessible from outside the class, even from other classes in the same package.
The main purpose of using private access is to hide the implementation details of a class and provide controlled access through public methods.
Syntax: private


*/


