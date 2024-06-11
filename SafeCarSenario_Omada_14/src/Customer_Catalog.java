import java.util.ArrayList;

public class Customer_Catalog {
private ArrayList<Customer> customers = new ArrayList<Customer>();
	

	public void addCustomer(Customer aClient) {
		customers.add(aClient);
	}
	
	public Customer findCustomer(String id_number)
	{
		for(Customer cl: customers)
		{
			if(cl.get_idNumber().equals(id_number)) 
			{
				return cl;
				
			}
		}
		return null;
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}
	

	
}

