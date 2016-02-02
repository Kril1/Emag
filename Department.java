import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Department {
	private static final String DEFAULT_NAME_OF_DEPARTMENT = "newDepartment";
	private String name;
	private ArrayList<Category> categories;
	
	//constructors
	public Department(){
		name=DEFAULT_NAME_OF_DEPARTMENT;
		categories=new ArrayList<Category>();
	}
	
	public Department(String name) {
		this();
		setName(name);
		
	}
	
//others

	public void addCategory(Category c){
		if (c == null) {
			System.out.println("Incorrect input!");
			return;
		}
		if(categories.contains(c)){
			System.out.println("There is already such category!");
			return;
		}
		categories.add(c);
		System.out.println("The category "+c+" is added.");

	}
	
	public void deleteCategory(Category c){
		if (c == null) {
			System.out.println("Incorrect input!");
			return;
		}
		boolean flag=categories.remove(c);
		if(flag){
			System.out.println("The category "+c+" is deleted.");
		}
		else
		{
			System.out.println("There isnt such category!");
		}
		
	}
	public void modifyNameOfCategory(Category c, String name){
		if(name==null || categories.contains(c)==false){
			System.out.println("Wrong input!");
			return;
		}
		for(int i=0; i<categories.size(); i++){
			if(categories.get(i).getName().equals(name)){
				System.out.println("There is already a category with that name!");
				return;
			}
		}
		int index=categories.indexOf(c);
		categories.get(index).setName(name);
	}
	
	//set & get
	public String getName() {
		return name;
	}

//?????????????????????????????????????
	public void setName(String name) { 
		if(name!=null){
		this.name = name;
		}
	}


	public Collection<Category> getCategories() {
		return Collections.unmodifiableCollection(categories);
	}


	
}
