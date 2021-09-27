package BOJ_dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9251TopDown {
	
	static char[] arr1;
	static char[] arr2;
	static Integer[][] dp;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		arr1 = br.readLine().toCharArray();
		arr2 = br.readLine().toCharArray();
		
		dp = new Integer[arr1.length][arr2.length];
		
		System.out.println(LCS(arr1.length-1,arr2.length-1));
	}
	
	public static int LCS(int idx1, int idx2) {
		if(idx1 == -1 || idx2 == -1) {
			return 0 ;
		}
		
		if(dp[idx1][idx2] == null) {
			dp[idx1][idx2] =0;
			
			if(arr1[idx1] == arr2[idx2]) {
				dp[idx1][idx2] = LCS(idx1-1, idx2-1) +1;
			}
			else {
				dp[idx1][idx2] = Math.max(LCS(idx1-1,idx2), LCS(idx1,idx2-1));
			}
		}
		
		return dp[idx1][idx2];
				
	}
}
