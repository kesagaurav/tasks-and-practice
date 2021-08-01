package StringBuilderPractice;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s=" hi my name is gaurav";
System.out.println(rev(s));
	
	}
	
	
	public static String rev(String s) {
		String a[]=s.split(" ");
		StringBuilder sb=new StringBuilder();
		StringBuilder st=new StringBuilder();
		for(int w=0;w<a.length;w++) {
			st.append(new StringBuilder(a[w]).reverse().toString()).append(" " );
		}
		
		return st.toString().trim();
	}

}
