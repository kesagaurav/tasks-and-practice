package Exception;

public class Password {
	
	public  boolean isPasswordValid(String password) throws InvalidPassword {
		if(password!=null && password.matches("[A-Z]{1}[0-9]{4}[a-z]{8}")) {
			return true;
		}else {
			throw new InvalidPassword("invalid password " + password +  " please try again");
		}
	}
	

}
