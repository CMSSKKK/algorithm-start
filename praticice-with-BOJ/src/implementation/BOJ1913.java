package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1913 {
	static int[][] arr;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	
 	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		int K = Integer.parseInt(br.readLine());
		
		int start = N*N;
		int x = -1;
		int y = 0;
		int dir = 0;
		int ansx = 0;
		int ansy = 0;
		
		while(start > 0) {
			int nx = x +dx[dir];
			int ny = y +dy[dir];
			
			if(nx<0 || ny<0 || nx >= N || ny >= N || arr[nx][ny] != 0) {
				dir = (dir+1)%4;
				continue;
			}
			x = nx;
			y = ny;
			arr[x][y] = start;
			if(start == K) {
				ansx = nx+1;
				ansy = ny+1;
			}
			start--;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append(arr[i][j]).append(" ");
			}
			sb.append('\n');
		}
		sb.append(ansx).append(" ").append(ansy);
		System.out.print(sb);
	}

}
