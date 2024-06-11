import java.util.ArrayList;
public class Final_Conclusion_Catalog {
	private ArrayList<Final_Conclusion> Conclusions = new ArrayList<Final_Conclusion>();
	
	public Final_Conclusion FindFinalConclusion(expert_report anExpert_report)
	{
		
			for(Final_Conclusion finalcl: Conclusions)
			{
				if(finalcl.get_expert_report().getDrivers().equals(anExpert_report.getDrivers())&&finalcl.get_expert_report().getAccident_date().equals(anExpert_report.getAccident_date())) 
				{
					return finalcl;
				}
			}
			return null;
		}
	
	public void AddConclusion(Final_Conclusion aConclusion)
	{
		Conclusions.add(aConclusion);
	}
}


