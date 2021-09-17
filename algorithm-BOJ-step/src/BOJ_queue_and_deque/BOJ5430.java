package BOJ_queue_and_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class BOJ5430 {
	
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		ArrayDeque<Integer> deque;
		while(T--> 0) {
			String com = br.readLine();
			
			int n = Integer.parseInt(br.readLine());
			
			deque = new ArrayDeque<>();
			st = new StringTokenizer(br.readLine(),"[],");
			
			for (int i = 0; i < n; i++) {
				deque.add(Integer.parseInt(st.nextToken()));
			}
			
			AC(com,deque);
			
			
		}
		System.out.println(sb);
		
		

		
	}
	
	public static void AC(String com, ArrayDeque<Integer> deque) {
		boolean right = true;
		
		for (char cmd : com.toCharArray()) {
			
			if(cmd =='R') {
				right = !right;
				continue;
			}
			
			if(right) {
				
				if(deque.pollFirst()== null) {
					sb.append("error").append('\n');
					return;
				}
				
			} else {
				if(deque.pollLast() == null) {
					sb.append("error").append('\n');
					return;
				} 
				
			}
			
			
			
			
		}
		out(deque, right);
	}
	
	public static void out(ArrayDeque<Integer> deque, boolean right) {
		
		sb.append('[');
		
		if(deque.size() > 0) {	
			
			if(right) {	
				
				sb.append(deque.pollFirst());	
				
				
				while(!deque.isEmpty()) {
					sb.append(',').append(deque.pollFirst());
				}
			}
			else {	
				sb.append(deque.pollLast());	
				
				 
				while(!deque.isEmpty()) {
					sb.append(',').append(deque.pollLast());
				}
			}
		}
		
		sb.append(']').append('\n');
	}

}
