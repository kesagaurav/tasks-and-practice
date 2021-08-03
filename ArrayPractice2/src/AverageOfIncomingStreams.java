
public class AverageOfIncomingStreams {

	public static void main(String[] args) {
	
		int a[]= {10,20,30,40,50};
		int sum=0;
		for(int i=0;i<a.length-1;i++) {
			sum+=a[i]/i+1;
			System.out.println(sum);
		}
		
		
	}

}
