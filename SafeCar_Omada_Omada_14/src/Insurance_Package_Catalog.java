import java.util.ArrayList;
public class Insurance_Package_Catalog {
	private ArrayList<Insurance_Package> insurance_packages= new ArrayList<Insurance_Package>();

	public Insurance_Package find_package(String aname) {
		for(Insurance_Package inp: insurance_packages )
		{
			if(inp.getName().equals(aname))
			{
				return inp;
			}
		}
		return null;
	}
	public void addInsurance_Package(Insurance_Package apackage)
	{
		insurance_packages.add(apackage);
	}
}
