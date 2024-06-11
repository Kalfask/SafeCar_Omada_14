import java.util.ArrayList;

public class VehicleCatalog {
	private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	public void AddVehicle(Vehicle aVehicle)
	{
		vehicles.add(aVehicle);
	}
	
	public Vehicle findVehicle(String arithmos_plaisiou)
	{
		for(Vehicle vh: vehicles)
		{
			if(vh.getArithmos_plaisiou().equals(arithmos_plaisiou))
			{
				return vh;
			}
		}
		return null;
	}

	public ArrayList<Vehicle> getVehicles() {
		return vehicles;
	}
}
