
public class PerfectArray {

	public static void main(String[] args) {
	int a[]= {1,2,3,2,1};
	for(int i=0;i<a.length/2;i++) {
		if(a[i]!=a.length-1) {
			System.out.println("perfect");
		}else {
			System.out.println("\n not perfect");
		}
	}

	}

}
