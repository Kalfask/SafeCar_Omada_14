import java.util.ArrayList;
public class Final_Conclusion_Catalog {
	private ArrayList<Final_Conclusion> Conclusions = new ArrayList<Final_Conclusion>();
	
	public Final_Conclusion FindFinalConclusion(expert_report anExpert_report,String AnIncident_Report)
	{
		
			for(Final_Conclusion finalcl: Conclusions)
			{
				if(finalcl.get_expert_report().equals(anExpert_report)&&finalcl.get_incident_report().equals(AnIncident_Report)) 
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


