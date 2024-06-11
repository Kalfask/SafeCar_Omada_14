

public class Employee {
	private String Username;
	private String password;
	private String _history;
	private int _users_rights;
	
	public Screen _prints;

	public String getHistory() {
		return this._history;
	}


	public int getUsers_rights() {
		return this._users_rights;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUsers_rights(int aUsers_rights) {
		this._users_rights = aUsers_rights;
	}


	public Employee(String username, String password, String _history, int _users_rights) {
		
		this.Username = username;
		this.password = password;
		this._history = _history;
		this._users_rights = _users_rights;
	}

	

	

	
	
	
}