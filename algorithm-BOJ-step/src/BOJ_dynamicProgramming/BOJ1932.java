package BOJ_dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1932 {
	
	public static int N;
	public static int[][] triangle;
	public static Integer[][] dp;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		triangle = new int[N][N];
		dp = new Integer[N][N];
		
		StringTokenizer st;
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			
			for (int j = 0; j < i+1; j++) {
				triangle[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < N; i++) {
			dp[N-1][i] = triangle[N-1][i];
		}
		
		System.out.println(maxSum(0,0));
	}
	
	public static int maxSum(int depth, int index) {
		if(depth == N-1) 
			return dp[depth][index];
		
		if(dp[depth][index] == null) {
			dp[depth][index] = Math.max(maxSum(depth+1,index), maxSum(depth+1,index+1))+ triangle[depth][index];
		}
		return dp[depth][index];
	}
}
