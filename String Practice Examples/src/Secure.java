
public class Secure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isSecure("https://www.google.com"));
		System.out.println(isSecure("http://www.w3schools.com"));

	}

	
	public static String  isSecure(String url) {
		if(url.startsWith("https")) {
			return "secure";
		}else {
			return "not secure";
		}
		
	}
	
}
