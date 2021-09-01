package BOJ_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11047 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N =Integer.parseInt(st.nextToken());
		int K =Integer.parseInt(st.nextToken());
		
		
		int[] coins = new int[N];
		
		for (int i = 0; i < coins.length; i++) {
			coins[i] = Integer.parseInt(br.readLine());
		}
		
		int count = 0;
		
		for (int i = N-1; i >= 0; i--) {
			if(coins[i]<=K) {
				count += (K/coins[i]);
				K = K % coins[i];
			}
		}
		System.out.println(count);

	}

}
