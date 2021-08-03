
public class ValueEqualToIndex {

	public static void main(String[] args) {

		int a[]= {15,2,3,4,5,6,7,45,12,7};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++) {
				if(a[i]==j) {
					//System.out.println("a[%d]" + "exists at " + a[i] + " at i " + j);
					System.out.println("a[i] " + " exists at " + a[i] + " at " + j);
				
				}
			}
		}
		
	}

}
