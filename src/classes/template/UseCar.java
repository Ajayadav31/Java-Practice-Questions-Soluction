package classes.template;

//Car.java
class Car {
 // Fields or instance variables
 private String make;
 private String model;
 private int year;
 private double price;

 // Constructor
 public Car(String make, String model, int year, double price) {
     this.make = make;
     this.model = model;
     this.year = year;
     this.price = price;
 }

 // Methods (getters and setters)
 public String getMake() {
     return make;
 }

 public void setMake(String make) {
     this.make = make;
 }

 public String getModel() {
     return model;
 }

 public void setModel(String model) {
     this.model = model;
 }

 public int getYear() {
     return year;
 }

 public void setYear(int year) {
     this.year = year;
 }

 public double getPrice() {
     return price;
 }

 public void setPrice(double price) {
     this.price = price;
 }

 // Additional method to display car information
 public void displayCarInfo() {
     System.out.println("Car Make: " + make);
     System.out.println("Car Model: " + model);
     System.out.println("Car Year: " + year);
     System.out.println("Car Price: $" + price);
 }
 
}


public class UseCar {
	public static void main(String[] args) {
		// make code
		
	}
}
