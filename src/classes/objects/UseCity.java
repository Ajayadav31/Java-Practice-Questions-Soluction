package classes.objects;

class City{
	
	// pro
	String cityName;
	int areaCode;
	Boolean isClean;
	
	// methods
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(int areaCode) {
		this.areaCode = areaCode;
	}
	public Boolean getIsClean() {
		return isClean;
	}
	public void setIsClean(Boolean isClean) {
		this.isClean = isClean;
	}
	
}


public class UseCity {
	public static void main(String[] args) {
			
			City bhopal = new City();
			
			System.out.println(bhopal.getCityName());
			System.out.println(bhopal.getAreaCode());
			System.out.println(bhopal.getIsClean());
			
			City indore = new City();
			
			bhopal.setCityName("Bhopal");
			bhopal.setAreaCode(462042);
			bhopal.setIsClean(true);
			
			indore.setCityName("Indore");
			indore.setAreaCode(67854);
			indore.setIsClean(false);
			
			System.out.println(indore.getCityName());
			System.out.println(indore.getAreaCode());
			System.out.println(indore.getIsClean());
			
		}
}




