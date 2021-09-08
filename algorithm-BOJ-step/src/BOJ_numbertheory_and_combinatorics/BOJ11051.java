package BOJ_numbertheory_and_combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11051 {
	
	public static int[][] DP;
	public static final int DIV = 10007;
	
 	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		DP = new int[N+1][K+1];
		
		System.out.println(bc(N,K));
		
	}
	
	public static int bc(int n, int k) {
		
		if(DP[n][k] > 0) {
			return DP[n][k];
		}
		if(k==0 || n ==k) {
			return DP[n][k] =1;
		}
		
		return DP[n][k] = (bc(n-1,k-1)+bc(n-1,k)) % DIV;
	}

}
