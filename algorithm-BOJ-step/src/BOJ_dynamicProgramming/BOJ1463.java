package BOJ_dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1463 {
	
	public static Integer[] dp;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		dp = new Integer[N+1];
		
		dp[0] = dp[1] = 0;
		
		System.out.println(minOper(N));
	}
	
	public static int minOper(int N) {
		
		if(dp[N] == null) {
			
			if(N%6 == 0) {
				dp[N] = Math.min(minOper(N-1),Math.min(minOper(N/3), minOper(N/2))) +1;
			}
			else if(N%3 == 0) {
				dp[N] = Math.min(minOper(N/3), minOper(N-1))+1;
			} 
			else if(N%2 == 0) {
				dp[N] = Math.min(minOper(N/2), minOper(N-1))+1;
			}
			else {
				dp[N] = minOper(N-1)+1;
			}
			
		}
		
		return dp[N];
	}
}