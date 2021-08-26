package BOJ_dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2156 {
	
	static Integer[] dp;
	static int[] wine;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		dp = new Integer[N+1];
		wine = new int[N+1];
		
		for (int i = 1; i < N+1; i++) {
			wine[i] = Integer.parseInt(br.readLine());
		}
		
		dp[0] = 0 ;
		dp[1] = wine[1];
		
		if(N>1) {
			dp[2] = wine[1]+wine[2];
		}
		
		System.out.println(maxWine(N));
				
	}
		
	
	public static int maxWine(int N) {
		if(dp[N] == null) {
			dp[N] = Math.max(Math.max(maxWine(N-2),maxWine(N-3)+wine[N-1])+wine[N],maxWine(N-1));
		}
		return dp[N];
	}

}
