package BOJ_numbertheory_and_combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11050 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		System.out.println(bionominalCoefficient(N, K));
	}
	
	public static int bionominalCoefficient(int n, int k) {
		if(n==k || k==0) {
			return 1;
		}
		
		return bionominalCoefficient(n-1, k-1)+bionominalCoefficient(n-1, k);
	}
}
