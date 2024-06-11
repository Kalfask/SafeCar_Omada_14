import java.util.ArrayList;
import java.util.Scanner;
public class expert_report_catalog {
	private ArrayList<expert_report> reports = new ArrayList<expert_report>();
	
	public expert_report SearchReport(String date,String Drivers) {
		for(expert_report exp: reports)
		{
			if(exp.getAccident_date().equals(date)&&exp.getDrivers().equals(Drivers))
			{
				return exp;
			}
		}
		return null;
	}

	public void updateReport(String date,String Drivers)
	{
		Scanner myObj = new Scanner(System.in);
		expert_report exp = null;
		int i;
		for(i=0;i<reports.size();i++)
		{
			if(reports.get(i).getAccident_date().equals(date)&&reports.get(i).getDrivers().equals(Drivers))
			{
				exp=reports.get(i);
				break;
			}
		}
		if(exp == null)
		{
			System.out.println("Report was not found");
		}
		else
		{
			System.out.println("What detail you want to update: 1.Driver, 2.Fault, 3.Damage (give a number for the answer)");
			int answer = myObj.nextInt();
			if(answer==1)
			{
				System.out.println("Current Data for Drivers "+exp.getDrivers()+"\n Give new Data:");
				String newDrivers = myObj.next();
				exp.setDrivers(newDrivers);
				reports.remove(i);
				reports.add(exp);
			}
			else if(answer == 2)
			{
					System.out.println("Current Data for Fault "+exp.getFault()+"\n Give new Data:");
					String newFault = myObj.next();
					exp.setFault(newFault);
					reports.remove(i);
					reports.add(exp);
			}
			else if(answer ==3)
			{
				System.out.println("Current Data for Damage "+exp.getDamage()+"\n Give new Data:");
				String newDamage = myObj.next();
				exp.setDamage(newDamage);
				reports.remove(i);
				reports.add(exp);
			}
			else
			{
				System.out.println("Invalid number");
			}
		}
	}
	
	public void AddReport(expert_report aReport)
	{
		reports.add(aReport);
	}
}