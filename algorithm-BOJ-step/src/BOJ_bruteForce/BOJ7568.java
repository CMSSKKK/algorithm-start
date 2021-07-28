package BOJ_bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ7568 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] headCount = new int[N][2];
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			for (int j = 0; j < 2; j++) {
			headCount[i][j] = Integer.parseInt(st.nextToken());	
			}
		}
		for (int i = 0; i < N; i++) {
			int rank = 1;
			
			for (int j = 0; j < N; j++) {
				if(i == j) continue;
				if(headCount[i][0] < headCount[j][0] && headCount[i][1] < headCount[j][1])
					rank++;
			}
			System.out.print(rank+" ");
		}
	}

}
