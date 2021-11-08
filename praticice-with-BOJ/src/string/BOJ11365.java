package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ11365 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();
		String temp ="";
		StringBuilder sb = new StringBuilder();
		
		while(!(temp =br.readLine()).equals("END")) {
			for (int i = 0; i < temp.length(); i++) {
				char c =temp.charAt(i);
				stack.push(c);
			}
			
			while(!stack.isEmpty()) {
				sb.append(stack.pop());
			}
			
			sb.append('\n');
		}
		
		System.out.println(sb);
	}

}
