package BOJ_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ11650 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[][] cooridinates = new int[N][2];
		
		for (int i = 0; i < cooridinates.length; i++) {
			st = new StringTokenizer(br.readLine()," ");			
			cooridinates[i][0] =Integer.parseInt(st.nextToken());
			cooridinates[i][1] =Integer.parseInt(st.nextToken());			
		}
		
		Arrays.sort(cooridinates, (e1, e2) -> { 
			if(e1[0] == e2[0]) {
				return e1[1] - e2[1];
			} else {
				return e1[0] - e2[0];
			}
		});
		
		for (int i = 0; i < N; i++) {
			System.out.println(cooridinates[i][0]+" "+cooridinates[i][1]);
		}
//		https://st-lab.tistory.com/243
//		https://st-lab.tistory.com/110?category=857114
	}

}
