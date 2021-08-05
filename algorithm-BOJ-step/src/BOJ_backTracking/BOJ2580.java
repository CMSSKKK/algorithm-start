package BOJ_backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2580 {
	
	public static int[][] board = new int[9][9]; 
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for (int j = 0; j < 9; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		sudoku(0,0);
	}
	
	public static void sudoku(int row, int col) {
		
		if(col == 9) {
			sudoku(row+1, 0);
			return;
		}
		
		if(row == 9) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					sb.append(board[i][j]).append(" ");
				}
				sb.append('\n');				
			}
			System.out.println(sb);
			
			System.exit(0); // 여러가지 결과가 나와도 하나만 출력한다. (시스템종료) 
		}
		
		if(board[row][col] == 0) {
			for (int i = 1; i <= 9; i++) {
				if(searchNum(row, col, i)) {
					board[row][col] = i;
					sudoku(row, col+1);
				}
			}
			board[row][col] = 0;
			return;
		}
		
		sudoku(row, col+1);
	}
	
	public static boolean searchNum(int row, int col, int number) {
		
		for (int i = 0; i < 9; i++) {
			if(board[row][i] == number) return false;
		}
		
		for (int i = 0; i < 9; i++) {
			if(board[i][col] == number) return false;
		}
		// 3*3 사각형 안에 겹치는 수 찾기 
		int smallRow =(row/3) * 3; // 시작 첫 행  
		int smallCol =(col/3) * 3; // 시작 첫 열 
		
		for (int i = smallRow; i < smallRow+3; i++) {
			for (int j = smallCol; j < smallCol+3; j++) {
				if(board[i][j] == number) return false;
			}
		}
		
		return true;
	}
	
}
