package BOJ_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class BOJ9012 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		while(T-->0) {
			sb.append(vps(br.readLine())).append('\n');
		}
		System.out.println(sb);
				
	}
	
	public static String vps(String str) {
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if(c =='(') {
				stack.add(c);
			} else if(stack.isEmpty()) {
				return "NO";
			} else {
				stack.pop();
			}
		}
		
		if(stack.isEmpty()) {
			return "YES";
		} else {
			return "NO";
		}
		
	}

}
