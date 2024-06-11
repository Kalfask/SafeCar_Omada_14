public class Vehicle {
	private String _registration_number;
	private String _model;
	private String _marque;
	private int _cubik_meters;
	private String _color;
	public Vehicle_Catalog _unnamed_Vehicle_Catalog_;
	public Insurance _has;

	public String getRegistration_number() {
		return this._registration_number;
	}

	public void setRegistration_number(String aRegistration_number) {
		this._registration_number = aRegistration_number;
	}

	

	public Vehicle(String _registration_number, String _model, String _marque, int _cubik_meters, String _color) {
		super();
		this._registration_number = _registration_number;
		this._model = _model;
		this._marque = _marque;
		this._cubik_meters = _cubik_meters;
		this._color = _color;
	}

	public String getModel() {
		return this._model;
	}

	public void setModel(String aModel) {
		this._model = aModel;
	}

	

	public String getMarque() {
		return this._marque;
	}

	public void setMarque(String aMarque) {
		this._marque = aMarque;
	}

	

	public int getCubik_meters() {
		return this._cubik_meters;
	}

	public void setCubik_meters(int aCubik_meters) {
		this._cubik_meters = aCubik_meters;
	}

	

	public String getColor() {
		return this._color;
	}

	public void setColor(String aColor) {
		this._color = aColor;
	}

	
}