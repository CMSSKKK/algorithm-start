package basic;

import java.util.Scanner;

public class BOJ2445 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N*2-1; i++) {
			if(i < N) {
				for (int j = N-1-i; j < N; j++) {
					sb.append('*');
				}
				for (int j = i+1; j < N; j++) {
					sb.append("  ");
				}
				for (int j = N-1-i; j < N; j++) {
					sb.append('*');
				}
				sb.append('\n');
			} else {
				for (int j = i-N+1; j < N; j++) {
					sb.append('*');
				}
				for (int j = N+i+1; j > N*2; j--) {
					sb.append("  ");
				}
				for (int j = i-N+1; j < N; j++) {
					sb.append('*');
				}
				sb.append('\n');
			}
			
			
		}
		System.out.println(sb);
	}

}
