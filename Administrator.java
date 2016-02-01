package emag;

public class Administrator extends User {

	Administrator(String name, String password, String eMail) {
		super(name, password, eMail);
	}

	void createDepartment(String name) {

		if (name != null) {
			Department index = new Department(name);
		}
	}

	void deleteDepartment(String name) {

		if (Department.nameOfDepartment.equals(name)) {

			Department.nameOfDepartment = null;

		}

	}

	void createCategory(String name) {

		if (name != null) {
			Category index = new Category(name);
		}
	}

	void deleteCategory(String name) {

		if (Category.nameOfCategory.equals(name)) {

			Category.nameOfCategory = null;

		}

	}

	void addProduct(Product product1, Category category) {

		if (product1 != null && category != null) {
			Product product1 = new Product();
		}
	}

	void deleteProduct(Product product1) {

		if (Product.nameOfProduct.equals(name)) {
			
		}

	}
}
