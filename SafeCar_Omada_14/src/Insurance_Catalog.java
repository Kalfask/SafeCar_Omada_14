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
			if(ins.get_client().getIdNumber().equals(aClient.getIdNumber()) && ins.get_vehicle().getRegistration_number().equals(aVehicle.getRegistration_number()))
			{
				return ins;
			}
		}
		return null;
	}
}