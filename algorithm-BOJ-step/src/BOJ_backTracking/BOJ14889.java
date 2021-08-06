package BOJ_backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14889 {
	
	public static int N;
	public static int[][] member;
	public static boolean[] visit;
	public static int minDiff = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		member = new int[N][N];
		visit = new boolean[N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for (int j = 0; j < N; j++) {
				member[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		choiceMem(0,0);
		System.out.println(minDiff);
	}
	
	public static void choiceMem(int num, int depth) {
		if(depth == N/2) {
			balancing();
			return;
		}
		for (int i = num; i < N; i++) {
			if(!visit[i]) {
				visit[i] = true;
				choiceMem(i+1, depth+1);
				visit[i]= false;
			}
		}
	}
	
	public static void balancing() {
		int start = 0;
		int link = 0;
		
		for (int i = 0; i < N-1; i++) {
			for (int j = i+1; j < N; j++) {
				if(visit[i] == true && visit[j] == true) {
					start += member[i][j];
					start += member[j][i];
 				}
				else if (visit[i] == false && visit[j] == false) {
					link += member[i][j];
					link += member[j][i];
				}
			}
		}
		
		int diff = Math.abs(start - link);
		
		if(diff == 0) {
			System.out.println(diff);
			System.exit(0);
		}
		
		minDiff = Math.min(minDiff, diff);
		
	}
}
