import java.util.ArrayList;

public class Vehicle_Catalog {
	private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	public void Save_vehicle_data() {
		throw new UnsupportedOperationException();
	}
	
	public void AddVehicle(Vehicle aVehicle)
	{
		vehicles.add(aVehicle);
	}
	
	public Vehicle findVehicle(String reg_nmber)
	{
		for(Vehicle vh: vehicles)
		{
			if(vh.getRegistration_number().equals(reg_nmber))
			{
				return vh;
			}
		}
		return null;
	}
}