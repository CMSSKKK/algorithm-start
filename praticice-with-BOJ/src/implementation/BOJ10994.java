package implementation;

import java.util.Scanner;

public class BOJ10994 {
	static char[][] star;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int len = 1;
		for (int i = 0; i < N-1; i++) {
			len += 4;
		}
		star = new char[len][len];
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				star[i][j] = ' ';
			}
		}
		
		draw(0,len);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <len; i++) {
			for (int j = 0; j < len; j++) {
				sb.append(star[i][j]);
			}
			sb.append('\n');
		}
		
		System.out.println(sb);
	}
	static void draw(int start, int len) {
		for (int i = start; i < len; i++) {
			star[start][i] = '*';
			star[len-1][i] = '*';
			star[i][start] = '*';
			star[i][len-1] = '*';				
		}
		
		if(len == 1) return;
		
		draw(start+2, len-2);
	}
}
