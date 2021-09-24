package BOJ_divide_and_conquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1992 {
	
	public static int[][] data;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int N = Integer.parseInt(br.readLine());
		
		data = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			String colors = br.readLine(); 
			for (int j = 0; j < N; j++) {
				data[i][j] = colors.charAt(j) -'0';
			}
		}
		
		QuadTree(0,0,N);
		System.out.println(sb);
	}
	
	public static void QuadTree(int row, int col, int size) {
		if(isSame(row,col,size) ) {
			sb.append(data[row][col]);
			return;
		}
		
		int dividedSize = size / 2;
		
		sb.append('(');
		
		QuadTree(row,col,dividedSize);
		QuadTree(row, col+dividedSize, dividedSize);
		QuadTree(row+dividedSize, col, dividedSize);
		QuadTree(row+dividedSize, col+dividedSize, dividedSize);
		
		sb.append(')');
	}
	
	public static boolean isSame(int row, int col, int size) {
		int val = data[row][col];
		
		for (int i = row; i < row+size; i++) {
			for (int j = col; j < col+size; j++) {
				if(val != data[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}
