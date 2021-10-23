package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ11725 {
	
	static List<Integer>[] list;
	static boolean[] visit;
	static int[] parents;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		list = new ArrayList[N+1];
		parents = new int[N+1];
		visit = new boolean[N+1];
		
		for (int i = 1; i <= N; i++) {
			list[i] = new ArrayList<>();
		}
		StringTokenizer st;
		for (int i = 0; i < N-1; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			list[a].add(b);
			list[b].add(a);
		}
		
		dfs(1);
		
		for (int i = 2; i <= N; i++) {
			System.out.println(parents[i]);
		}
				
	}
	
	static void dfs(int p) {
		visit[p] = true;
		
		for ( int i : list[p] ) {
			if(!visit[i]) {
				parents[i] = p;
				dfs(i);
			}
		}
	}
	
}
