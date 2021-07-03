package baek_for;

import java.util.Scanner;

public class baek8393 {
	// n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
		int N = sc.nextInt();			
		int sum = 0;
		for (int i = 1; i < N+1; i++) {
			sum +=i;				
		}
		System.out.println(sum);
		
	}
}
