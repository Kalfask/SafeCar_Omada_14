import java.util.ArrayList;

public class Insurance_Contract_Catalog {
	private ArrayList<InsuranceContract> insurances = new ArrayList<InsuranceContract>();

	public void addInsuranceContract(InsuranceContract anInsurance) {
		insurances.add(anInsurance);
	}
	
	public InsuranceContract findInsuranceContract(Customer aClient,Vehicle aVehicle)
	{
		for(InsuranceContract ins: insurances)
		{
			if(ins.getCustomer().get_idNumber().equals(aClient.get_idNumber()) && ins.getVehicle().getArithmos_plaisiou().equals(aVehicle.getArithmos_plaisiou()))
			{
				return ins;
			}
		}
		return null;
	}
	
	public void printData()
	{
		int i=0;
		for(InsuranceContract ins: insurances)
		{
			i++;
			System.out.println("Insurance Contract"+i+" "+ins.getCustomer().get_name()+" "+ins.getVehicle().getPinakida()+" "+ins.getInsurancepolicy().getPerigrafi()+" "+ ins.getCost());
		}
		System.out.println();
	}

	public ArrayList<InsuranceContract> getInsurances() {
		return insurances;
	}
	
}

