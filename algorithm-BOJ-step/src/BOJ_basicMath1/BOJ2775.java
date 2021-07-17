package BOJ_basicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2775 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
					
		int[][] A = new int[15][15];
		
		for(int i = 0; i < 15; i++) {
			A[i][1] = 1;	
			A[0][i] = i;	
		}
 
 
		for(int i = 1; i < 15; i ++) {	
 
			for(int j = 2; j < 15; j++) {	
				A[i][j] = A[i][j - 1] + A[i - 1][j];
			}
		}
		
		for (int i = 0; i < T; i++) {
			int k= Integer.parseInt(br.readLine());
			int n= Integer.parseInt(br.readLine());						
			System.out.println(A[k][n]);
			}
				
	}

}
