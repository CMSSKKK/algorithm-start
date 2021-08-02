package BOJ_backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ15649 {
	
	public static boolean[] node;
	public static int[] numbers;
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		node = new boolean[N];
		numbers = new int[M];
		dfs(N,M,0);
		System.out.println(sb);
	}
	
	public static void dfs(int N, int M, int depth) {
		if(depth == M) {			
			for (int num : numbers) {
				sb.append(num).append(" ");
			}
			sb.append('\n');
			return;
		}
		
		for (int i = 0; i < N; i++) {
			if(!node[i]) {
				node[i] = true;
				numbers[depth] = i+1;				
				dfs(N, M, depth+1);
				node[i] = false;				
			}
			
		}
	}
}
