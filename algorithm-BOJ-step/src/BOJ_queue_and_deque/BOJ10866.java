package BOJ_queue_and_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ10866 {
	
	public static Deque<Integer> deque = new LinkedList<>();
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			switch(st.nextToken()) {
				case "push_front" : pushFront(Integer.parseInt(st.nextToken())); break;	
				case "push_back" : pushBack(Integer.parseInt(st.nextToken())); break;
				case "pop_front" : popFront(); break;
				case "pop_back" : popBack(); break;			
				case "size" : size(); break;
				case "empty" : empty(); break;
				case "front" : front(); break;
				case "back" : back(); break;
 			}
		}
		System.out.println(sb);
	}
	
	public static void pushFront(int val) {
		deque.offerFirst(val);
	}
	public static void pushBack(int val) {
		deque.offerLast(val);
	}
	
	public static void popFront() {
		if(deque.size()==0) {
			sb.append(-1).append('\n');
		} else {
			sb.append(deque.pollFirst()).append('\n');
		}
	}
	
	public static void popBack() {
		if(deque.size()==0) {
			sb.append(-1).append('\n');
		} else {
			sb.append(deque.pollLast()).append('\n');
		}
	}
	
	public static void size() {
		sb.append(deque.size()).append('\n');
	}
	
	public static void empty() {
		if(deque.size() == 0) {
			sb.append(1).append('\n');
		} else {
			sb.append(0).append('\n');
		}
	}
	
	public static void front() {
		if(deque.size() == 0) {
			sb.append(-1).append('\n');
		} else {
			sb.append(deque.peekFirst()).append('\n');
		}
	}
	
	public static void back() {
		if(deque.size() == 0) {
			sb.append(-1).append('\n');
		} else {
			sb.append(deque.peekLast()).append('\n');
		}
	}
}
