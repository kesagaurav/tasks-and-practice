package Exception;

public class AdharCard {
	
	public boolean isAdharValid(String name) throws InvalidAdhar {
		if(name!=null && name.matches("[A-Z]{3}[a-z]{3}[0-9]{8}")) {
			return true;
		}else {
			throw new InvalidAdhar("invalid adhar number " + name + " plz try again after some time");
		}
	}

}
