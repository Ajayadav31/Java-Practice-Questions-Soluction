

class Laptop{
	
	private String companyName;
	private String colour;
	private int price;
	
	//SETTER
	
	public void setCompanyName( String companyName ) {
		this.companyName = companyName;
	}
	public void setColour( String colour) {
		this.colour = colour;
	}
	public void setPrice( int price ) {
		this.price = price;
	}
	
	//GETTER
	
	public String getCompanyName() {
		return this.companyName;
	}
	public String getColour() {
		return this.colour;
	}
	public int getPrice() {
		return this.price;
	}	
	
}


class Bottel{
	
	private String company;
	private int quantity;
	private int price;
	
	//SETTER
	
	public void setCompany(String company) {
		this.company = company;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//GETTER
	

	public String getCompany() {
		return this.company;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	public int getPrice() {
		return this.price;
	}
}
class Mob{
	
	private String company;
	private String model;
	private int price;
	
	//SETTER
	
	public void setCompany(String company) {
		this.company = company;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//GETTER
	
	public String getCompany() {
		return this.company;
	}
	public String getModel() {
		return this.model;
	}
	public int getPrice() {
		return this.price;
	}
	

}
public class UseLaptop {

	public static void main(String[] args) {
		System.out.println("hello world");
		
		Laptop hp = new Laptop();
		
		hp.setCompanyName("Dell");
		hp.setColour("Black");
		hp.setPrice(50_000);
		
		System.out.println(hp.getCompanyName());
		System.out.println(hp.getColour());
		System.out.println(hp.getPrice());
		
		Bottel water = new Bottel();
		
		water.setCompany("Bisleri");
		water.setQuantity(200);
		water.setPrice(20);
		
		System.out.println(water.getCompany());
		System.out.println(water.getQuantity());
		System.out.println(water.getPrice());
		
		Mob phone = new Mob();
		
		phone.setCompany("Sqmsung");
		phone.setModel("A-12");
		phone.setPrice(20_000);
		
		System.out.println(phone.getCompany());
		System.out.println(phone.getModel());
		System.out.println(phone.getPrice());
		
		
	}

}
