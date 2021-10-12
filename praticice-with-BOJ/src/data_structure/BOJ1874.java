package data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ1874 {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		int point = 0;
		
		while(N-->0) {
			int num = Integer.parseInt(br.readLine());
			
			if(num > point) {
				for (int i = point+1; i <= num; i++) {
					stack.push(i);
					sb.append('+').append('\n');
				}
				point = num;
			}
			else if(stack.peek() != num) {
				System.out.println("NO");
				return;
			}
			
			stack.pop();
			sb.append('-').append('\n');
		}
		
		System.out.println(sb);

	}
	
}
