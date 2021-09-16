package BOJ_queue_and_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ1021 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		LinkedList<Integer> deque = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			deque.offer(i);
		}
		st = new StringTokenizer(br.readLine()," ");
		int[] index = new int[M];
		
		for (int i = 0; i < index.length; i++) {
			index[i] = Integer.parseInt(st.nextToken());
		}
		int count = 0;
		
		for (int i = 0; i < index.length; i++) {
			
			int target = deque.indexOf(index[i]);
			int halfSize;
			
			if(deque.size() % 2 == 0) {
				halfSize = deque.size() / 2 -1;
			} else {
				halfSize = deque.size() / 2;
			}
			
			if(target <= halfSize) {
				for (int j = 0; j < target; j++) {
					deque.offerLast(deque.pollFirst());
					count++;
				}
			} else {
				for (int j = 0; j < deque.size()- target; j++) {
					deque.offerFirst(deque.pollLast());
					count++;
				}
			}
			
			deque.pollFirst();
		}
		
		System.out.println(count);
		
		
		
	}

}
