package BOJ_numbertheory_and_combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1010 {
	public static int[][] DP = new int[30][30];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while(T-- > 0 ) {
			
			st = new StringTokenizer(br.readLine()," ");
			int N = Integer.parseInt(st.nextToken()); 
			int M = Integer.parseInt(st.nextToken());
			
			sb.append(com(M,N)).append('\n');
		}
		System.out.println(sb.toString());
	}
	
	public static int com(int n, int r) {
		if(DP[n][r]>0) {
			return DP[n][r];
		}
		if(r == 0 || n == r) {
			return DP[n][r] = 1;
		}
		
		return DP[n][r] = com(n-1, r-1) + com(n-1,r);
	}
}
