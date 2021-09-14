package BOJ_queue_and_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ18258 {
	
	public static int size = 0;
	public static int[] queue;
	public static int front = 0;
	public static int back = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		queue = new int[N];
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine()," ");
			
			switch(st.nextToken()) {
				case "push" : 
					push(Integer.parseInt(st.nextToken()));
					break;
				case "pop" :
					sb.append(pop()).append('\n');
					break;
				case "size" :
					sb.append(size()).append('\n');
					break;
				case "empty" :
					sb.append(empty()).append('\n');
					break;
				case "front" :
					sb.append(front()).append('\n');
					break;
				case "back" :
					sb.append(back()).append('\n');
					break;
 			}
		}
		System.out.println(sb);
	}
	
	public static void push(int num) {
		queue[back] = num;
		size++;
		back++;
	}
	
	public static int pop() {
		if(size == 0) {
			return -1;
		} else {
			int out = queue[front];
			size--;
			front++;
			return out;
		}
	}
	
	public static int size() {
		
		return size;
	}
	
	public static int empty() {
		if(size == 0) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public static int front() {
		if(size == 0) {
			return -1;
		} else {
			return queue[front];
		}
	}
	
	public static int back() {
		if(size == 0) {
			return -1;
		} else {
			return queue[back-1];
		}
	}
}
