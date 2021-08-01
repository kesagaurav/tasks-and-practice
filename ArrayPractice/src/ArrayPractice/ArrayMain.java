package ArrayPractice;

import java.util.Scanner;

public class ArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\n ener size of aray");;
		int n=Integer.parseInt(sc.nextLine());
		System.out.println("Enter an arrya:");
		String ar[]=new String[n];
		for(int w=0;w<n;w++) {
			ar[w]=sc.nextLine();
		}
		
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<ar.length;i++) {
			if(ar[i].charAt(0)==ar[i].charAt(ar[i].length()-1)) {}
			else {
				sb.append(ar[i]).append("");
			}
		}
		System.out.println(sb.toString().trim());
	}

}
