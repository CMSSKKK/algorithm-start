package dp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1010 {
	
	static int[][] dp = new int[30][30];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine());
			
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			sb.append(dp(N,M)).append('\n');
			
		}
		System.out.println(sb);
		
	}
	
	static int dp(int n, int m) {
		if(dp[n][m]>0) {
			return dp[n][m];
		}
		
		if(m == 0 || n == m) {
			return dp[n][m] = 1;
		}
		
		return dp[n][m] = dp(n-1,m-1)+dp(n-1,m);
			
	}

}
