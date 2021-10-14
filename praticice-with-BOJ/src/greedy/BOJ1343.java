package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1343 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = "AAAA";
		String b = "B";
 		char[] board = br.readLine().toCharArray();
 		
		int start = 0;
		int end = 0;
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < board.length; i++) {
			if (board[i] == 'X') {
				start =i;
				while(i <board.length-1 && board[i+1] =='X') {
					i++;
				}
				end = i;
				
				int count = end - start + 1;
				if(count%2 == 0) {
					for (int j = 0; j < count/4; j++) {
						sb.append(a);
					}
					for (int j = 0; j < count%4; j++) {
						sb.append(b);
					}
				} else {
					System.out.println(-1);
					return;
				}
				
			} else {
				sb.append(".");
			}
		}
		System.out.println(sb);
	}

}
