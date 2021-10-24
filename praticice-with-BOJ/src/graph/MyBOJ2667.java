package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MyBOJ2667 {
	static int N;
	static int[][] map = new int[25][25];
	static boolean[][] visit = new boolean[25][25];
	static int[] aparts = new int[25*25];
	static int apartNum = 0;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			String temp = br.readLine();
			for (int j = 0; j < N; j++) {
				map[i][j]= temp.charAt(j)-'0';
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(map[i][j] ==1 && !visit[i][j]) {
					apartNum++;
					dfs(i,j);
				}
			}
		}
		
		System.out.println(apartNum);
		Arrays.sort(aparts);
		for (int i = 0; i < aparts.length; i++) {
			if(aparts[i] !=0) {
				System.out.println(aparts[i]);
			}
		}
	}
	
	static void dfs(int x, int y) {
		visit[x][y]= true;
		aparts[apartNum]++;
		
		for (int i = 0; i <4; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			
			if(nx>=0 && ny>=0 && nx<N && ny< N) {
				if(map[nx][ny]==1 && !visit[nx][ny]) {
					dfs(nx,ny);
				}
			}
		}
	}

}
