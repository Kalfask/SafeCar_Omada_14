public class expert_report {
	private String _accident_date;
	private String _accident_place;
	private String _drivers;
	private String _fault;
	private String _damage;
	private Object _photos_of_accident;
	public Screen _prints;


	public String getAccident_date() {
		return this._accident_date;
	}

	public void setAccident_date(String aAccident_date) {
		this._accident_date = aAccident_date;
	}	
	public String getAccident_place() {
		return this._accident_place;
	}

	public void setAccident_place(String aAccident_place) {
		this._accident_place = aAccident_place;
	}



	public String getDrivers() {
		return this._drivers;
	}

	public void setDrivers(String aDrivers) {
		this._drivers = aDrivers;
	}



	public String getFault() {
		return this._fault;
	}

	public void setFault(String aFault) {
		this._fault = aFault;
	}

	
	

	public String getDamage() {
		return this._damage;
	}

	public void setDamage(String aDamage) {
		this._damage = aDamage;
	}

	public expert_report(String _accident_date, String _accident_place, String _drivers, String _fault,
			String _damage) {
		this._accident_date = _accident_date;
		this._accident_place = _accident_place;
		this._drivers = _drivers;
		this._fault = _fault;
		this._damage = _damage;
	}
}