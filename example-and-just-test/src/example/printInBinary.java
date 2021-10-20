package example;

import java.util.Scanner;

public class printInBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		binary(N);
		
	}
	
	static void binary(int N) {
		if(N<2)
			System.out.print(N);
		else {
			binary(N/2);
			System.out.print(N%2);
		}
	}
}
