import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Category {

	private static final String DEFAULT_NAME_OF_Category = "newCategory";
	private String name;
	private ArrayList<Product> products;
	
	
	
	//constructors
		 Category() {
			name=DEFAULT_NAME_OF_Category;
			products=new ArrayList<Product>();
		}
		
		Category(String name) {
			this();
			setName(name);
			
		}
		
	//others

		public void addProduct(Product p){
			if (p == null) {
				System.out.println("Incorrect input!");
				return;
			}
			if(products.contains(p)){
				System.out.println("There is already such product!");
				return;
			}
			products.add(p);
			System.out.println("The product "+p+" is added.");
		}
		
		public void deleteProduct(Product p){
			if (p == null) {
				System.out.println("Incorrect input!");
				return;
			}
			boolean flag=products.remove(p);
			if(flag){
				System.out.println("The product "+p+" is deleted.");
			}
			else
			{
				System.out.println("There isnt such product!");
			}
			
		}
		public void modifyNameOfCategory(Product p, String name){
			if(name==null || products.contains(p)==false){
				System.out.println("Wrong input!");
				return;
			}
			for(int i=0; i<products.size(); i++){
				if(products.get(i).getName().equals(name)){
					System.out.println("There is already a category with that name!");
					return;
				}
			}
			int index=products.indexOf(p);
			products.get(index).setName(name);
		}
		
		private int partition(ArrayList<Product> arr, int left, int right, int pivotIndex){
			Product pivotValue=arr.get(pivotIndex);
			Product tmp=arr.get(pivotIndex);
			arr.remove(pivotIndex);
			arr.add(pivotIndex, arr.get(right));
			arr.remove(right);
			arr.add(right, tmp);
			int storeIndex=left;
			for(int i=left; i<right; i++){
				if(arr.get(i).getPrice() < pivotValue.getPrice()){
					tmp=arr.get(i);
					arr.remove(i);
					arr.add(i, arr.get(storeIndex));
					arr.remove(storeIndex);
					arr.add(storeIndex, tmp);
					storeIndex++;
				}
			}
			
			tmp=arr.get(storeIndex);
			arr.remove(storeIndex);
			arr.add(storeIndex, arr.get(right));
			arr.remove(right);
			arr.add(right, tmp);
			return storeIndex;
			
		}
		private void quickSort(ArrayList<Product> arr, int left, int right){
			if(left<right){
				int pivotIndex=left+(right-left)/2;
				int pivotNewIndex=partition(arr, left, right, pivotIndex);
				quickSort(arr, left, pivotNewIndex-1);
				quickSort(arr, pivotNewIndex+1, right);
			}
			
		}
		public ArrayList<Product> sortProductsInCategoryByPriceInAscendingOrder(){
			quickSort(products, 0, products.size()-1);
			return products;
		}
		public void sortProductsInCategoryByPriceInDescendingOrder(){
			sortProductsInCategoryByPriceInAscendingOrder();
			for(int i=0; i<products.size()/2; i++){
				Product tmp=products.get(i);
				products.remove(i);
				products.add(i,products.get(products.size()-i-1));
				products.remove(products.size()-i-1);
				products.add(products.size()-i-1, tmp);
			}
		}
		//setters & getters
		public String getName() {
			return name;
		}
		
		

//???????????????????????????????
		public void setName(String name) {
			if(name!=null){
			this.name = name;
			}
		}


		public Collection<Product> getProducts() {
			return Collections.unmodifiableCollection(products);
		}


}
