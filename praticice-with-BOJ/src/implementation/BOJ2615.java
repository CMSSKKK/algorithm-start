package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2615 {
	static int[][] board = new int[21][21];
	static int[][][] check = new int[21][21][4];
	static int[] dr = {1,1,0,-1};
	static int[] dc = {0,1,1,1};
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for (int i = 1; i < 20; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j < 20; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		System.out.println(search());
		
		
		

	}
	static int omok(int r,int c, int dir, int val) {
		int nr =r+dr[dir];
		int nc =c+dc[dir];
		
		if(board[nr][nc] == val ) {
			return check[nr][nc][dir] = omok(nr,nc,dir,val)+1;
		}
		
		return 1;
	}
	
	static String search() {
		for (int i = 1; i < 20; i++) {
			for (int j = 1; j < 20; j++) {
				if(board[j][i] != 0) {
					for (int k = 0; k < 4; k++) {
						if(check[j][i][k] == 0 && omok(j,i, k, board[j][i]) == 5) {
							return board[j][i] + "\n" + j +" "+ i ;
						} 
					}
				}
			}
		}
		return "0";
	}
	
}
