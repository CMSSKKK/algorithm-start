package BOJ_stack;

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
		
		int start = 0;
		
		while(N-- >0) {
			
			int number = Integer.parseInt(br.readLine());
			
			if(number > start) {
				for (int i = start+1; i <= number; i++) {
					stack.push(i);
					sb.append('+').append('\n');
				}
				start = number;
				
			} else if(stack.peek()!= number) {
				System.out.println("NO");
				System.exit(0);
			}
			
			stack.pop();
			sb.append('-').append('\n');
					
		}
		System.out.println(sb);
	}
}
