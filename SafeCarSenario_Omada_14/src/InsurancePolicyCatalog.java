import java.util.ArrayList;

public class InsurancePolicyCatalog {
	private ArrayList<InsurancePolicy> insurancepolicies= new ArrayList<InsurancePolicy>();

	public InsurancePolicy find_package(String kodikos) {
		for(InsurancePolicy inp: insurancepolicies )
		{
			if(inp.getKodikos_paketou().equals(kodikos))
			{
				return inp;
			}
		}
		return null;
	}
	public void addInsurance_Package(InsurancePolicy apolicy)
	{
		insurancepolicies.add(apolicy);
	}
}
