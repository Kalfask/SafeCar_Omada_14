import java.util.ArrayList;

public class Client_Catalog {
	private ArrayList<Client> clients = new ArrayList<Client>();
	

	public void addClient(Client aClient) {
		clients.add(aClient);
	}
	
	public Client findClient(String id_number)
	{
		for(Client cl: clients)
		{
			if(cl.getIdNumber().equals(id_number)) 
			{
				return cl;
			}
		}
		return null;
	}
}