package example;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		System.out.println(gcd(M,N));
		System.out.println(gcd2(M,N));

	}
	
	static int gcd(int m, int n) {
		if(n>m) {
			int temp = m; m=n; n=temp;
		}
		
		if(m%n== 0) {
			return n;
		} else {
			return gcd(n, m%n);
		}
	}
	
	static int gcd2(int p, int q) {
		if(q==0) 
			return p;
		else
			return gcd2(q,p%q);
	}
	

}
