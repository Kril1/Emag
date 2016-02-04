package Classes;

public class Product {
	private static final int MAX_QUANTITY_FOR_A_PRODUCT = 50;
	private static int id = 1;
	private String name;
	private String description; 
	private String imageFileName;
	private double price;
	private int productID;
	private int quantity;
	
	public Product(String name, double price) {
		if(name != null && !name.equals("")) {
			this.name = name;
		}
		
		this.productID = this.id;
		this.id++;
		this.setPrice(price);
		this.quantity = 1;
	}
	
	public void displayProduct() {
		
	}
	
	public void getProductDetails() {
		System.out.println("Product name: " + this.getName());
		System.out.println("Product ID: " + this.getProductID());
		System.out.println("Price: " + this.getPrice());
		System.out.println("Description: " + this.getDescription());
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getProductID() {
		return this.productID;
	}
	
	public String getImageFileName() {
		return this.imageFileName;
	}
	
	public void setImageFileName(String imageFileName) {
		if(imageFileName != null && !imageFileName.equals("")) {
			this.imageFileName = imageFileName;
		}
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		if(price > 0) {
			this.price = price;
		}
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String description) {
		if(description != null && !description.equals("")) {
			this.description = description;
		}
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public void setQuantity(int quantity) {
		if(quantity > 1 && quantity <= MAX_QUANTITY_FOR_A_PRODUCT) {
			this.quantity = quantity;
		}
	}

}
