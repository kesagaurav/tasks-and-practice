package Exception;

public class Gaurav {

	public boolean isValidEmail(String email) throws InValidEmail {
		
		if(email!=null && email.matches("[a-z]{6}[A-Z]{3}[0-9]{5}[*]{1}")) {
			return true;
		}else {
			throw new InValidEmail("it is invalid email " + email + " so please try anthor attempt");
		}
		
	}
	
}
