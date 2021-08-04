package BOJ_backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BOJ9663 {
	
	public static int[] board;
	public static int N;
	public static int count = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		board = new int[N];
		
		nQueen(0);
		System.out.println(count);
	}

	public static void nQueen(int depth) {
		if(depth == N) {
			count++;
//			for(int val : board) {
//				System.out.print(val);
//			}
//			System.out.println();
			return;
		}
		
		for(int i = 0; i < N; i++) {
			board[depth] = i;
			if(isPossible(depth)) {
				nQueen(depth+1);
			}
		}
	}
	
	public static boolean isPossible(int col) {
		
		for (int i = 0; i < col; i++) {
			
			if(board[col] == board[i]) {
				return false;
			}
			
			else if (Math.abs(col-i) == Math.abs(board[col] - board[i])) {
				return false;
			}
		}
		
		return true;
	}
}
