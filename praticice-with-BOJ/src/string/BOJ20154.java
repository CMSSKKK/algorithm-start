package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ20154 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = {3, 2, 1, 2, 3, 3, 3, 3, 1, 1, 3, 1, 3, 3, 1, 2, 2, 2, 1, 2, 1, 1, 2, 2, 2, 1};
		
		char[] input = br.readLine().toCharArray();
		Queue<Integer> que = new LinkedList<>();
		for (int i = 0; i < input.length; i++) {
			int index = input[i]-'A';
			que.add(arr[index]);
		}
		
		while(que.size()>1) {
			
				for (int i = 0; i < que.size(); i+=2) {
					
					if(i == que.size()-1) {
						que.add(que.poll());
					}
					
					int temp = (que.poll()+que.poll()) %10;
					
					que.add(temp);
				}
			
		}
		
		int ans = que.poll();
		
		if(ans %2 == 1) {
			System.out.println("I'm a winner!");
		} else {
			System.out.println("You're the winner?");
		}
	}

}
