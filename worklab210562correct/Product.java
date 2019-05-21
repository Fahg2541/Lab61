public class Product {
	private String name;
	private int price;
	private String productID;
	
	public Product() {
	
	}

	public Product(String n, int p, String pID) {
		this.name = n;
		this.price = p;
		this.productID = pID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setProductID(String pID) {
		this.productID = pID;
	}
	
	public String getProductID() {
		return productID;
	}

}
