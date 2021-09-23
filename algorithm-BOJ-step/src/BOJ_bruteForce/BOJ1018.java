package BOJ_bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1018 {
	
	public static boolean[][] board;
	public static int min = 64;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		board = new boolean[N][M];
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			
			for (int j = 0; j < M; j++) {
				if(str.charAt(j) == 'W') {
					board[i][j]= true; 
				} else { 
					board[i][j] = false;
				}
			}
		}
		
		int caseN = N - 7;
		int caseM = M - 7;
		
		for (int i = 0; i < caseN; i++) {
			for (int j = 0; j < caseM ; j++) {
				coloring(i,j);
			}
		}
		System.out.println(min);
		
	}
	
	public static void coloring(int a, int b) {
		int endA = a+8;
		int endB = b+8;
		int count = 0;
		
		boolean color = board[a][b];
		
		for (int i = a; i < endA; i++) {
			for (int j = b; j < endB; j++) {
				
				if(board[i][j] != color) {
					count++;
				}
				
				color = !color;
			}
			color = !color;
		}
		
		count = Math.min(count, 64-count); 
		
		min = Math.min(min, count);
	}


}
