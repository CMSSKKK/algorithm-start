package data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class BOJ10845 {
	public static LinkedList<Integer> queue = new LinkedList<>();
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st; 
		for (int i = 0; i < N; i++) {
			st  = new StringTokenizer(br.readLine()," ");
			switch(st.nextToken()) {
				case "push" : push(Integer.parseInt(st.nextToken())); break;
				case "pop" : pop(); break;
				case "size" : size(); break;
				case "empty" : empty(); break;
				case "front" : front(); break;
				case "back" : back(); break;
			}
		}
		System.out.println(sb);
		
	}
	public static void push(int val) {
		queue.offer(val);
	}
	
	public static void pop() {
		if(queue.isEmpty()) {
			sb.append(-1).append('\n');
		} else {
			sb.append(queue.poll()).append('\n');
		}
	}
	
	public static void size() {
		sb.append(queue.size()).append('\n');
	}
	
	public static void empty() {
		if(queue.isEmpty()) {
			sb.append(1).append('\n');
		} else {
			sb.append(0).append('\n');
		}
	}
	public static void front() {
		if(queue.isEmpty()) {
			sb.append(-1).append('\n');
		} else {
			sb.append(queue.getFirst()).append('\n');
		}
	}
	public static void back() {
		if(queue.isEmpty()) {
			sb.append(-1).append('\n');
		} else {
			sb.append(queue.getLast()).append('\n');
		}
	}
}
