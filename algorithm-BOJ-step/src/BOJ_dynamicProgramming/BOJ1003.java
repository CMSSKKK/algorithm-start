package BOJ_dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BOJ1003 {
	
	static Integer[][] dp = new Integer[41][2]; // NULL 체크때문에 Integer 배열 (N은 40보다 작거나 같은 자연수 또는 0이다) 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		dp[0][0] = 1;
		dp[0][1] = 0;
		dp[1][0] = 0;
		dp[1][1] = 1;
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		while(T-- > 0) {
			int N = Integer.parseInt(br.readLine());
			fibonacci(N);
			sb.append(dp[N][0] + " " + dp[N][1]).append('\n');
		}
		System.out.println(sb);
	}
	
	static Integer[] fibonacci(int N) {
		if(dp[N][0] == null || dp[N][1] == null) {
			dp[N][0] = fibonacci(N-1)[0] + fibonacci(N-2)[0];
			dp[N][1] = fibonacci(N-1)[1] + fibonacci(N-2)[1];
		}
		
		return dp[N];
	}
}
