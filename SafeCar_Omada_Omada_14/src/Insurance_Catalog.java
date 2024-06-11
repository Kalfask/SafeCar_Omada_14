import java.util.ArrayList;

public class Insurance_Catalog {
	public Insurance _unnamed_Insurance_;
	private ArrayList<Insurance> insurances = new ArrayList<Insurance>();

	public void addInsurance(Insurance anInsurance) {
		insurances.add(anInsurance);
	}
	
	public Insurance findInsurance(Client aClient,Vehicle aVehicle)
	{
		for(Insurance ins: insurances)
		{
			if(ins.get_client().equals(aClient) && ins.get_vehicle().equals(aVehicle))
			{
				return ins;
			}
		}
		return null;
	}
}