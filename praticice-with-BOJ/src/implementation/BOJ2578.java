package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2578 {
	static int bingo = 0;
	static int[][] board = new int[5][5];
	static boolean[][] check = new boolean[5][5];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int count = 0;
		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				int temp = Integer.parseInt(st.nextToken());
				count++;
				
				for (int x = 0; x < 5; x++) {
					for (int y = 0; y < 5; y++) {
						if(temp == board[x][y]) {
							check[x][y] = true;
							
							rowCheck();
							colCheck();
							leftCheck();
							rightCheck();
							
							if(bingo >= 3) {
								System.out.println(count);
								return;
							}
							bingo = 0;
						}
					}
				}
			}
		}
		
		
	}
	static void rowCheck() {
		
		for (int i = 0; i < 5; i++) {
			int cnt = 0;
			for (int j = 0; j <5; j++) {
				if(check[i][j] == true)
					cnt++;
				if(cnt == 5) {
					bingo++;
				}
			}
			
		}
		
	}
	static void colCheck() {
		
		for (int i = 0; i < 5; i++) {
			int cnt = 0;
			for (int j = 0; j <5; j++) {
				if(check[j][i] == true)
					cnt++;
				if(cnt == 5) {
					bingo++;
				}
			}
			
		}
	}
	static void leftCheck() {
		int cnt = 0;
		for (int i = 0; i < 5; i++) {
			if(check[i][i] == true)
				cnt++;
			if(cnt == 5) {
				bingo++;
			}
		}
	}
	static void rightCheck() {
		int cnt = 0;
		for (int i = 0; i < 5; i++) {
			if(check[i][4-i] == true)
				cnt++;
			if(cnt == 5) {
				bingo++;
			}
		}
	}
	

}
