package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2522 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i <2*N-1; i++) {
			if(i < N) {
				for (int j = N-i-1; j>0 ; j--) {
					sb.append(' ');
				}
				for (int j = N-i-1; j < N; j++) {
					sb.append('*');
				}
				sb.append('\n');
			}
			
			else { 
				for (int j = N+i; j>N*2-1 ; j--) {
					sb.append(' ');
				}
				for (int j = i; j < N*2-1; j++) {
					sb.append('*');
				}
				sb.append('\n');
			}
		}
		System.out.println(sb);
	}

}
