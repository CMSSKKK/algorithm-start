package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1343ver2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] board = br.readLine().toCharArray();
		StringBuilder sb = new StringBuilder();
		int count = 0;
		for (int i = 0; i < board.length; i++) {
			if(board[i] =='X') {
				count++;
			}
			
			if(board[i] =='.') {
				if(count %2 != 0) {
					System.out.println(-1);
					return;
				}
				for (int j = 0; j < count/4; j++) {
					sb.append("AAAA");
				}
				for (int j = 0; j < count%4/2; j++) {
					sb.append("BB");
				}
				sb.append(".");
				count = 0;
			}
			
			if(i == board.length-1) {
				if(count %2 != 0) {
					System.out.println(-1);
					return;
				}
				for (int j = 0; j < count/4; j++) {
					sb.append("AAAA");
				}
				for (int j = 0; j < count%4/2; j++) {
					sb.append("BB");
				}
			}
		}
		System.out.println(sb);
	}

}
