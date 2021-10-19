package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10992 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= N; i++) {
			
			if( i == N ) {
				for (int j = 0; j < N*2-1; j++) {
					sb.append('*');
				}
			} 
			
			else {
				for (int j = i; j < N; j++) {
					sb.append(' ');
				}
				
				sb.append('*');
				for (int j = 0; j < 2*(i-1)-1; j++) {
					sb.append(' ');
				}
				
				if(i == 1) {
					sb.append('\n');
				} else {
					sb.append('*').append('\n');
				}
						
			}
			
		}
		System.out.println(sb);
	}

}
