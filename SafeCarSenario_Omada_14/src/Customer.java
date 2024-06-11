
public class Customer {
	private String _name;
	private String _surname;
	private String _phone;
	private String _email;
	private String _idNumber;
	
	public Customer(String _name, String _surname, String _phone, String _email, String _idNumber) {
		this._name = _name;
		this._surname = _surname;
		this._phone = _phone;
		this._email = _email;
		this._idNumber = _idNumber;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String get_surname() {
		return _surname;
	}

	public void set_surname(String _surname) {
		this._surname = _surname;
	}

	public String get_phone() {
		return _phone;
	}

	public void set_phone(String _phone) {
		this._phone = _phone;
	}

	public String get_email() {
		return _email;
	}

	public void set_email(String _email) {
		this._email = _email;
	}

	public String get_idNumber() {
		return _idNumber;
	}

	public void set_idNumber(String _idNumber) {
		this._idNumber = _idNumber;
	}
	
	
}
