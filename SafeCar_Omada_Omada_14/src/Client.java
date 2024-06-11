public class Client {
	private String _name;
	private String _surname;
	private String _phone;
	private String _email;
	private String _idNumber;
	public Insurance _has;
	public Screen _prints;


	public void deleteInsurance(Insurance aInsurance) {
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return this._name;
	}

	public void setName(String aName) {
		this._name = aName;
	}

	public String getSurname() {
		return this._surname;
	}

	public void setSurname(String aSurname) {
		this._surname = aSurname;
	}


	public String getPhone() {
		return this._phone;
	}

	public void setPhone(String aPhone) {
		this._phone = aPhone;
	}

	public String getEmail() {
		return this._email;
	}

	public void setEmail(String aEmail) {
		this._email = aEmail;
	}

	public String getIdNumber() {
		return this._idNumber;
	}

	public void setIdNumber(String aIdNumber) {
		this._idNumber = aIdNumber;
	}

	public Client(String _name, String _surname, String _phone, String _email, String _idNumber) {
		this._name = _name;
		this._surname = _surname;
		this._phone = _phone;
		this._email = _email;
		this._idNumber = _idNumber;
	}

}