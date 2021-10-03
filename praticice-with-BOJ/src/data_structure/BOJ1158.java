package data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ1158 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			queue.add(i);
		}
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		while(!queue.isEmpty()) {
			for (int i = 1; i <= K; i++) {
				if(i == K) {
					if(queue.size() == 1) {
						sb.append(queue.poll()).append(">");
					} else {
						sb.append(queue.poll()).append(", ");
					}
					
				} else {
					queue.offer(queue.poll());
				}
			}
		}
		
		System.out.println(sb);
	}

}
