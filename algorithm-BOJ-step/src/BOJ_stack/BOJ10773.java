package BOJ_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ10773 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		
		int K = Integer.parseInt(br.readLine());
		int sum = 0;
		
		while(K-- >0) {
			int num  = Integer.parseInt(br.readLine());
			
			if(stack.isEmpty() && (num==0)) {
				continue;
			} else if(num == 0) {
				stack.pop();
			} else {
				stack.add(num);	
			}			
		}
		
		for (Integer integer : stack) {
			sum += integer;
		}
		
		System.out.println(sum);
	}

}
