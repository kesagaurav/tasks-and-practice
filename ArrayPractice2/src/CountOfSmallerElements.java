import java.util.Scanner;

public class CountOfSmallerElements {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		int c=0;
		int a[]= {1,2,4,5,8,10};
		System.out.println("enter the x value");
		int x=sc.nextInt();
		for(int i=0;i<a.length;i++) {
			if(a[i]<x) {
				c++;
			}
		}
		System.out.println(c);
		sc.close();

	}

}
