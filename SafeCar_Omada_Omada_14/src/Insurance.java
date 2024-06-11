public class Insurance {
	private String _start;
	private String _cost;
	private String _end;
	private Insurance_Package _insurance_package;
	private Client _client;
	private Vehicle _vehicle;
	public Screen _prints;


	public boolean findPackage(Insurance_Package aPackage_3) {
		throw new UnsupportedOperationException();
	}

	public String getStart() {
		return this._start;
	}

	public void setStart(String aStart) {
		this._start = aStart;
	}


	public String getCost() {
		return this._cost;
	}

	public void setCost(String aCost) {
		this._cost = aCost;
	}



	public String getEnd() {
		return this._end;
	}

	public void setEnd(String aEnd) {
		this._end = aEnd;
	}

	

	public Client get_client() {
		return _client;
	}

	public void set_client(Client _client) {
		this._client = _client;
	}

	public Vehicle get_vehicle() {
		return _vehicle;
	}

	public void set_vehicle(Vehicle _vehicle) {
		this._vehicle = _vehicle;
	}

	public Insurance_Package get_insurance_package() {
		return _insurance_package;
	}

	public void set_insurance_package(Insurance_Package _insurance_package) {
		this._insurance_package = _insurance_package;
	}

	public Insurance(String _start, String _cost, String _end, Insurance_Package _insurance_package, Client _client,
			Vehicle _vehicle) {

		this._start = _start;
		this._cost = _cost;
		this._end = _end;
		this._insurance_package = _insurance_package;
		this._client = _client;
		this._vehicle = _vehicle;
	}
	
	
}