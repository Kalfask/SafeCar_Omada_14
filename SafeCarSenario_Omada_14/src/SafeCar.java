
public class SafeCar {

	public static void main(String[] args) {
		
		//kataskeuh pelatwn
		Customer flag_customer;
		Customer_Catalog customer_catalog = new Customer_Catalog();
		flag_customer = customer_catalog.findCustomer("AO79432");
		if(flag_customer ==  null)
		{
			Customer Customer1 = new Customer("Maria","Papadopoulou","2310264368","maria.papadopoulou@gmail.com","AO79432");
			customer_catalog.addCustomer(Customer1);
		}
		else System.out.println("The customer already exists");
		
		flag_customer = customer_catalog.findCustomer("AO77813");
		if(flag_customer ==  null)
		{
			Customer Customer2 = new Customer("Evanthia","Papagianni","2310245368","evanthia.papagianni@gmail.com","AO77813");
			customer_catalog.addCustomer(Customer2);
			
		}
		else System.out.println("The customer already exists");
		
		flag_customer = customer_catalog.findCustomer("AO45698");
		if(flag_customer ==  null)
		{
			Customer Customer3 = new Customer("Vasilis","Karagiannis","2310245668","ioannis.karagiannis@gmail.com","AO45698");
			customer_catalog.addCustomer(Customer3);
		}
		else System.out.println("The customer already exists");
		
		
		//kataskeyh oxhmatwn
		
		Vehicle flag_vehicle;
		VehicleCatalog vehiclecatalog = new VehicleCatalog();
		flag_vehicle = vehiclecatalog.findVehicle("7C3FR76A515072256");
		if(flag_vehicle == null)
		{
			Vehicle Vehicle1 = new Vehicle("Mercedes", "GLC", "XKP8923","2020","7C3FR76A515072256");
			vehiclecatalog.AddVehicle(Vehicle1);
		}
		else 
		{
			System.out.println("This vehicle already exists");
		}
		
		flag_vehicle = vehiclecatalog.findVehicle("7C3FR76A555071465");
		if(flag_vehicle == null)
		{
			Vehicle Vehicle2 = new Vehicle("Subaru","Forester", "NII4269", "2018","7C3FR76A555071465");
			vehiclecatalog.AddVehicle(Vehicle2);
		}
		else 
		{
			System.out.println("This vehicle already exists");
		}
		
		flag_vehicle = vehiclecatalog.findVehicle("7C3FR76A55504645");
		if(flag_vehicle == null)
		{
			Vehicle Vehicle3 = new Vehicle("Ford", "Ranger", "KOH4681", "2022","7C3FR76A55504645");
			vehiclecatalog.AddVehicle(Vehicle3);
		}
		else 
		{
			System.out.println("This vehicle already exists");
		}
		
		//kataskeuh policies
		InsurancePolicyCatalog policy_catalog = new InsurancePolicyCatalog();
		InsurancePolicy InsurancePolicy1 = new InsurancePolicy("ΜI93", "Mikti asfalisi", "6");
		policy_catalog.addInsurance_Package(InsurancePolicy1);
		InsurancePolicy InsurancePolicy2 = new InsurancePolicy("B56", "Basiki asfalisi", "6");
		policy_catalog.addInsurance_Package(InsurancePolicy2);
		InsurancePolicy InsurancePolicy3 = new InsurancePolicy("O58", "Me odiki", "6");
		policy_catalog.addInsurance_Package(InsurancePolicy3);
		
		//kataskeuh contract
		Insurance_Contract_Catalog Contract_Catalog = new Insurance_Contract_Catalog();
		InsuranceContract InsuranceContract1 = new InsuranceContract(customer_catalog.getCustomers().get(0),vehiclecatalog.getVehicles().get(0),InsurancePolicy2,60);
		Contract_Catalog.addInsuranceContract(InsuranceContract1);
		
		InsuranceContract InsuranceContract2 = new InsuranceContract(customer_catalog.getCustomers().get(1),vehiclecatalog.getVehicles().get(1),InsurancePolicy1,120);
		Contract_Catalog.addInsuranceContract(InsuranceContract2);
		
		InsuranceContract InsuranceContract3 = new InsuranceContract(customer_catalog.getCustomers().get(2),vehiclecatalog.getVehicles().get(2),InsurancePolicy3,80);
		Contract_Catalog.addInsuranceContract(InsuranceContract3);
		
		//ektypwsh
		Contract_Catalog.printData();
		
		double ins_sum;
		int i;
		int ar=1;
		for(i=0;i<customer_catalog.getCustomers().size();i++)
		{
			ins_sum=0;
			System.out.print("Customer"+ar+" ");
			for(InsuranceContract ins:Contract_Catalog.getInsurances())
			{
				if(ins.getCustomer().get_idNumber().equals(customer_catalog.getCustomers().get(i).get_idNumber()))
						{
							System.out.print(ins.getVehicle().getPinakida()+" ");
							ins_sum+=ins.getCost();
						}
			}
			System.out.print(ins_sum+" \n");
			ar++;
		}
		
	}
	
}
