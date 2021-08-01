package ArrayPractice;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("\n enter nos u wnat to input");
		int n = sc.nextInt();
		System.out.println("\n the nos are " + n);
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		System.out.println("\n the nos are");
		for (int i = 1; i <a.length; i++) {
			if (isPrime(a[i])) {
				System.out.println(a[i] + " ");
			}
			sc.close();
		}

	}

	public static boolean isPrime(int j) {
		int c = 0;
		for (int i = 1; i <= j; i++) {
			if (j % i == 0) {
				c++;
			}
		}
		if (c == 2) {
			return true;
		} else {
			return false;
		}
	}

		
}

