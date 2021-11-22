package dp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10870 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		System.out.println(dp(N));
	}
	static int dp(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		return dp(n-2)+dp(n-1);
	}
	
}
