package Classes;

import java.util.ArrayList;

public class ShoppingCart {
	private static final int MAX_NUMBER_OF_PRODUCTS_TO_BE_ORDERED = 50;
	private ArrayList<Product> products = new ArrayList<Product>();
	
	public void addProduct(Product p) {
		if(p != null) {
			products.add(p);
		}
	}
	
	public void addProduct(Product p, int quantity) {
		if(p != null && quantity > 1 && quantity <= MAX_NUMBER_OF_PRODUCTS_TO_BE_ORDERED) {
			p.setQuantity(quantity);
			products.add(p);
		}
	}
	
	public void modifyProductQuantity(Product p, int quantity) {
		if(p != null && products.contains(p) && quantity > 0 && quantity <= MAX_NUMBER_OF_PRODUCTS_TO_BE_ORDERED) {
			p.setQuantity(quantity);
		}
	}
	
	public void deleteProduct(Product p) {
		if(products.contains(p) && p != null) {
			products.remove(p);
		}
	}
	
	public void emptyCart() {
		products.clear();
	}
	
	public double sumOfCart() {
		double sum = 0;
		for(Product p : products) {
			sum += p.getPrice() * p.getQuantity();
		}
		
		return sum;
	}
	
}
