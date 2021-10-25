package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ20546 {
	static int N;
	static int[] prices;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		prices = new int[14];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < prices.length; i++) {
			prices[i] = Integer.parseInt(st.nextToken());
		}
//		System.out.println(bnp(N));
//		System.out.println(timing(N));
		if(bnp(N) > timing(N) ) 
			System.out.println("BNP");
		else if(bnp(N) < timing(N) )  
			System.out.println("TIMING");
		else
			System.out.println("SAMESAME");
		
	}
	static int bnp(int n) {
		int stock = 0;
		
		for (int i = 0; i < prices.length; i++) {
			if(n>=prices[i]) {
				int nowBuy = n/prices[i];
				stock += nowBuy;
				n %= prices[i]; 
			}
		}
		return stock*prices[prices.length-1]+n;
	}
	
	static int timing(int n) {
		int up=0;
		int down=0;
		int stock = 0;
		for (int i = 1; i < prices.length; i++) {
			int temp = prices[i];
			
			if(temp > prices[i-1]) {
				up++;
				down = 0;
			}
			else if(temp < prices[i-1]) {
				down++;
				up = 0;
			} else {
				down = up = 0;
			}
			
			if(up >= 3 && stock>0 ) {
				n = temp *stock;
				stock = 0;
			}
			
			if(n >= temp && down >= 3) {
				stock += n/temp;
				n %= temp;
			}
		}
		return n+stock*prices[prices.length-1];
	}

}
