

class Shop{
	
	private String address;
	private String shopKeeper;
	private int shopNumber;
	
	public void setAddress(String address) {
		this.address = address;
	}
	public void setShopKeeper(String shopKeeper) {
		this.shopKeeper = shopKeeper;
	}
	public void setShopNumber(int shopNumber) {
		this.shopNumber = shopNumber;
	}
	
	public String getAddress() {
		return this.address;
	}
	public String getShopKeeper() {
		return this.shopKeeper;
	}
	public int getShopNumber() {
		return this.shopNumber;
	}
	
}

public class UseShop {
	
	public static void main(String[] args) {
		//Create object
		
		Shop food = new Shop();
		
		food.setShopKeeper("asms");
		food.setShopNumber(444_345);
		food.setAddress("Lalita nagar");
		
		System.out.println(food.getAddress());
		System.out.println(food.getShopKeeper());
		System.out.println(food.getShopNumber());
		
	}

}
