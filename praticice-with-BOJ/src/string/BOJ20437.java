package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BOJ20437 {
	
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			
			String str = br.readLine();
			int k = Integer.parseInt(br.readLine());
			check(str, k);
			
		}
		
		System.out.println(sb);
	}
	
	static void check(String input, int n) {
		int len = input.length();
		int[] alpha = new int[26];
		
		for (int i = 0; i < len; i++) {
			alpha[input.charAt(i)-'a']++;
		}
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < len; i++) {
			int cur = input.charAt(i);
			if(alpha[cur-'a'] < n) {
				continue;
			}
			int count = 0;
			
			for (int j = i; j < len; j++) {
				if(cur == input.charAt(j)) {
					count++;
				}
				
				if(count == n) {
					min = Math.min(min, j-i+1);
					max = Math.max(max, j-i+1);
					break;
				}
			}
		}
		
		if(min != Integer.MAX_VALUE) {
			sb.append(min).append(" ").append(max);
		} else {
			sb.append(-1);
		}
		
		sb.append('\n');
 		
	}
	
		
	
}
