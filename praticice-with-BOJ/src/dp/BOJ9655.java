package dp;

import java.util.Scanner;

public class BOJ9655 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		boolean[] dp = new boolean[1001];
		
		dp[1] = true;
		dp[2] = false;
		
		for (int i = 3; i <= N; i++) {
			dp[i] = dp[i-2];
		}
		System.out.println(dp[N] ? "SK" : "CY");
		
		//System.out.println((N%2 == 1) ? "SK" : "CY");
	}

}
