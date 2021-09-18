package BOJ_recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2447 {
	public static char[][] board;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		board = new char[N][N];
		star(0,0,N,false);
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <N; j++) {
				sb.append(board[i][j]);
			}
			sb.append('\n');
		}
		System.out.println(sb);
		
		
	}
	public static void star(int row, int col, int size, boolean blank) {
		if(blank) {
			for (int i = row; i <row+size; i++) {
				for (int j = col; j < col+size; j++) {
					board[i][j] = ' ';
				}
			}
			return;
		}
		
		if(size == 1) {
			board[row][col] ='*';
			return;
		}
		
		int dividedSize = size / 3;
		int count= 0;
		for (int i = row; i < row+size; i +=dividedSize ) {
			for (int j = col; j < col+size; j+=dividedSize) {
				count++;
				if(count == 5) {
					star(i,j,dividedSize,true);
				} else {
					star(i,j,dividedSize,false);
				}
			}
		}
	
	}
}
