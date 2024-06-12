import java.util.ArrayList;

public class Employee_Catalog {
	
	private ArrayList<Employee> employees = new ArrayList<Employee>();

	public  Employee findEmployee(String aPassword, String aUsername) {
		
		for(Employee emp: employees)
		{
			if(emp.getUsername().equals(aUsername)&&emp.getPassword().equals(aPassword))
			{
				return emp;
			}
		}
		return null;
	}
	
	public  void Add_Employee(Employee anEmployee)
	{
		employees.add(anEmployee);
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}
	
}