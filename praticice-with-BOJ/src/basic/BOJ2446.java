package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2446 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < 2*N; i++) {
			if(i <= N) {
				for (int j = 2*N-i+1; j < 2*N; j++) {
					sb.append(' ');
				}
				for (int j = 2*i-1; j < 2*N; j++) {
					sb.append('*');
				}
				sb.append('\n');
			}
			
			else { 
				for (int j =1; j <2*N-i ; j++) {
					sb.append(' ');
				}
				for (int j = 2*N; j<2*i+1; j++) {
					sb.append('*');
				}
				sb.append('\n');
			}
		}
		System.out.println(sb);
	}

}
