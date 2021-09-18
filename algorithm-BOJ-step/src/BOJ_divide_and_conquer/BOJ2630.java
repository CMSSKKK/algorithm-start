package BOJ_divide_and_conquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2630 {
	
	public static int blue = 0;
	public static int white = 0;
	public static int[][] board;
	
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		board = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			for (int j = 0; j < N; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		divide(0,0,N);
		
		System.out.println(white);
		System.out.println(blue);
	}
	
	public static void divide(int row, int col, int size) {
		if(check(row,col,size)) {
			if(board[row][col]==0) {
				white++;
			}
			else {
				blue++;
			}
			return;
		}
		
		int dividedSize = size / 2;
		
		divide(row, col, dividedSize);
		divide(row,col+dividedSize,dividedSize);
		divide(row+dividedSize, col, dividedSize);
		divide(row+dividedSize,col+dividedSize,dividedSize);
		
	}
	
	public static boolean check(int row, int col, int size) {
		
		int color = board[row][col];
		
		for (int i = row; i < row+size; i++) {
			for (int j = col; j < col+size; j++) {
				
				if(board[i][j]!=color) {
					return false;
				}
			}
		}
		return true;
	}

}
