package classes.template;

 class Bottle {
    private String material;
    private double capacity;
    private boolean isReusable;

    public Bottle(String material, double capacity, boolean isReusable) {
        this.material = material;
        this.capacity = capacity;
        this.isReusable = isReusable;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public boolean isReusable() {
        return isReusable;
    }

    public void setReusable(boolean reusable) {
        isReusable = reusable;
    }

    public void fill() {
        System.out.println("Bottle filled with water.");
    }

    public void empty() {
        System.out.println("Bottle emptied.");
    }

    public void displayInfo() {
        System.out.println("Bottle Material: " + material);
        System.out.println("Bottle Capacity: " + capacity + " ml");
        System.out.println("Bottle is Reusable: " + (isReusable ? "Yes" : "No"));
    }
 }
    
public class UseBottal {
	public static void main(String[] args) {
		// make code
		
	}
}
