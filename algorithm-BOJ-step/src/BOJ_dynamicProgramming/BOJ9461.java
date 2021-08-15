package BOJ_dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9461 {
	
	public static long[] sequence = new long[101];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=4; i< 101; i++) {
			sequence[i] = -1;
		}
		
		sequence[0] = 0;
		sequence[1] = 1;
		sequence[2] = 1;
		sequence[3] = 1;
		
		
		for(int i = 0; i <T; i++) {
			int N = Integer.parseInt(br.readLine());
			sb.append(triangle(N)).append('\n');
		}
		System.out.println(sb);
	}
	
	public static long triangle(int N) {
		if(sequence[N] == -1) {
			sequence[N] = triangle(N-2) + triangle(N-3);
		}
		
		return sequence[N];
	}

}
