package BOJ_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ17298 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int[] numbers = new int[N];
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < numbers.length; i++) {
			
			while(!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
				numbers[stack.pop()] = numbers[i];
			}
			
			stack.push(i);						
		}
		
		while(!stack.isEmpty()) {
			numbers[stack.pop()] = -1;
		}
		
		for (int i : numbers) {
			sb.append(i).append(" ");
		}
		
		System.out.println(sb);
	}
}
