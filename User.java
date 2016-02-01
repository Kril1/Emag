package emag;

public class User {

	private String name;
	private String password;
	private String eMail;

	User(String name, String password, String eMail) {
		setName(name);
		seteMail(eMail);
		setPassword(password);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {

		if (name != null) {
			this.name = name;
		}

	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (password != null && password.length() > 5) {
			this.password = password;
		}
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		if (eMail != null && eMail.contains("@")) {
			this.eMail = eMail;
		}
	}

	boolean verifyLogIn(String name, String password) {

		if (name.equals(getName()) && password.equals(password)) {
			return true;
		} else {
			return false;
		}
	}

	void logIn(String name, String password) {

		boolean verify = verifyLogIn(name, password);
		
		if (verify == true){
			System.out.println("you have logged in.");
		}

	}
	void logOut (){
		this.name = null;
		this.password = null;
		this.eMail = null;
		System.out.println("you have logged out.");
	}

}
