package BOJ_dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2579 {
	
	public static Integer[] dp;
	public static int[] steps;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		steps = new int[N+1];
		dp = new Integer[N+1];
		
		dp[0] = steps[0];
		
		for (int i = 1; i <= N; i++) {
			steps[i] = Integer.parseInt(br.readLine());
		}
		dp[1] = steps[1];
		
		if(N>=2) {
			dp[2] = steps[1]+steps[2];
		}
		
		System.out.println(maxSum(N));
	}
	
	public static int maxSum(int N) {
		
		if(dp[N] == null) {
			dp[N] = Math.max(maxSum(N-2), maxSum(N-3)+steps[N-1]) + steps[N];
		}
		
		return dp[N];
	}
}
