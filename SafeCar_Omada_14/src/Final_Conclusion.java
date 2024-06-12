public class Final_Conclusion {
	private expert_report _expert_report;
	private String _incident_report;
	public Screen _prints;


	public void findFinalConclusion(Final_Conclusion aFinal_Con) {
		throw new UnsupportedOperationException();
	}

	public Final_Conclusion(expert_report _expert_report, String _incident_report) {
		this._expert_report = _expert_report;
		this._incident_report = _incident_report;
	}

	public expert_report get_expert_report() {
		return _expert_report;
	}

	public void set_expert_report(expert_report _expert_report) {
		this._expert_report = _expert_report;
	}

	public String get_incident_report() {
		return _incident_report;
	}

	public void set_incident_report(String _incident_report) {
		this._incident_report = _incident_report;
	}
	
}