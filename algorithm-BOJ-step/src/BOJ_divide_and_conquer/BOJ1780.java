package BOJ_divide_and_conquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1780 {
	
	public static int[][] paper;
	public static int minusOne = 0;
	public static int zero = 0;
	public static int one = 0;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		paper = new int[N][N];
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			for (int j = 0; j < N; j++) {
				paper[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		cut(0,0,N);
		
		System.out.println(minusOne);
		System.out.println(zero);
		System.out.println(one);

	}
	
	public static void cut(int row, int col, int size) {
		if(isSame(row,col,size)) {
			if(paper[row][col] == -1) {
				minusOne++;
				
			} else if(paper[row][col] == 0) {
				zero++;
				
			} else {
				one++;
				
			}
			return;
			
		}
		
		int divSize = size / 3;
		
		cut(row, col, divSize);
		cut(row, col+divSize, divSize);
		cut(row, col+(divSize*2), divSize);
		cut(row+divSize, col, divSize);
		cut(row+divSize, col+divSize, divSize);
		cut(row+divSize, col+(divSize*2), divSize);
		cut(row+(divSize*2), col, divSize);
		cut(row+(divSize*2), col+divSize, divSize);
		cut(row+(divSize*2), col+(divSize*2), divSize);
	}
	
	public static boolean isSame(int row, int col, int size) {
		int val = paper[row][col];
		
		for (int i = row; i < row+size; i++) {
			for (int j = col; j < col+size; j++) {
				if(val != paper[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}
