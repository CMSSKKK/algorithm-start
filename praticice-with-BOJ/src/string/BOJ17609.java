package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ17609 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while (T--> 0) {
			String temp = br.readLine();
			sb.append(check(temp, 0,temp.length()-1,0)).append('\n');
		}
		System.out.println(sb);
		
	}
	static int check(String s, int left, int right, int cnt) { 
		
		if (cnt == 2) { 
			return 2; 
		}
		
		int result = cnt; 
		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				int leftVal = check(s, left+1, right, cnt+1);
				int rightVal = check(s, left, right-1, cnt+1); 
				result = Math.min(leftVal, rightVal); 
				break; 
			} 
			left++; 
			right--; 
		} 
		
		return result; 
	}

	
}
