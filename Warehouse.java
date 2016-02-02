
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class Warehouse {
	private static Warehouse theWarehouse = null;
	private ArrayList<Department> departments;

	// creates singleton class
	private Warehouse() {
		this.departments = new ArrayList<Department>();
	}

	public static Warehouse getWarehouse() {
		if (theWarehouse == null) {
			theWarehouse = new Warehouse();
		}
		return theWarehouse;
	}


	
// others
	public void addDepartment(Department d) {
		if (d == null) {
			System.out.println("Incorrect input!");
			return;
		}
		if(departments.contains(d)){
			System.out.println("There is already such department!");
			return;
		}
		departments.add(d);
		System.out.println("The department "+d+" is added.");
	}
	
	public void deleteDepartment(Department d) {
		if (d == null) {
			System.out.println("Incorrect input!");
			return;
		}
		boolean flag=departments.remove(d);
		if(flag){
			System.out.println("The department "+d+" is deleted.");
		}
		else
		{
			System.out.println("There isnt such department!");
		}
	}
	
	public void modifyNameOfDepartment(Department d, String name){
		if(name==null || departments.contains(d)==false){
			System.out.println("Wrong input!");
			return;
		}
		for(int i=0; i<departments.size(); i++){
			if(departments.get(i).getName().equals(name)){
				System.out.println("There is already a department with that name!");
				return;
			}
		}
		int index=departments.indexOf(d);
		departments.get(index).setName(name);
	}

	
	//getter
	public Collection<Department> getDepartments() {
		return Collections.unmodifiableCollection(departments);
	}
}
