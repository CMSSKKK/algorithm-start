package BOJ_backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ15652 {

	public static int numbers[];
	public static int N,M;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine()," ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		numbers = new int[M];
		dfs(1,0);
		System.out.println(sb);
		
	}
	
	public static void dfs(int start, int depth) {
		if(depth == M) {
			for(int num : numbers) {
				sb.append(num).append(" ");
			}
			sb.append('\n');
			return;
		}
		
		for (int i = start; i <= N; i++) {
			numbers[depth] = i;
			dfs(i, depth+1);
		}
	}
}