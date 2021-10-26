package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ4396 {
	static char[][] board;
	static char[][] checked;
	static int N;
	static int[] dx = {-1,-1,-1,0,1,1,1,0};
	static int[] dy = {-1,0,1,1,1,0,-1,-1};
	static boolean dead = false;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		board = new char[N][N];
		checked = new char[N][N];
		for (int i = 0; i < N; i++) {
			board[i] = br.readLine().toCharArray();	
		}
		
		for (int i = 0; i < N; i++) {
			checked[i] = br.readLine().toCharArray();	
		}
						
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				
				checked[i][j] = findMine(i,j);
								
			}
			
		}
		
		if(dead) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					char val = board[i][j];
					if(val == '*') {
						checked[i][j] = '*';
					}
					
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append(checked[i][j]);
			}
			sb.append('\n');
		}
		System.out.println(sb);
		
		
	}
	
	static char findMine(int x, int y) {
		int nx = 0;
		int ny = 0;
		int count = 0;
		if(checked[x][y] == 'x') {
			if (board[x][y] == '*') {
				dead = true;
			}
			for (int i = 0; i < dx.length; i++) {
				nx = x+dx[i];
				ny = y+dy[i];
				if(nx>= 0 && ny >=0 && nx < N && ny < N) {
					if(board[nx][ny] == '*') {
						count++;
					}
										
				}
			}
			
			return (char)(count+'0');
			
		} 
			
		
		else {
			return'.';
		}
		
	
	}
}
