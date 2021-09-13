package BOJ_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ4949 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String text = br.readLine();
			if(text.startsWith(".")) {
				break;
			}
			sb.append(balance(text)).append('\n');
		}
		
		System.out.println(sb);
				
	}
	
	public static String balance(String str) {
		Stack<Character> stack = new Stack<>();
				
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if(c == '(' || c =='[') {
				stack.add(c);
			} else if (c ==')') {
				
				if(stack.isEmpty() || stack.peek() !='(') {
					return "no";
				} else {
					stack.pop();
				}
			} else if (c ==']') {
				
				if(stack.isEmpty() || stack.peek() !='[') {
					return "no";
				} else {
					stack.pop();
				}
			}
			
		}
		
		if(stack.isEmpty()) {
			return "yes";
		} else {
			return "no";
		}
		
		
		
		
	}
	
}
