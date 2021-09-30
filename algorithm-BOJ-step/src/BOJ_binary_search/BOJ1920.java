package BOJ_binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1920 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] numN = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < numN.length; i++) {
			numN[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(numN);
		
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < M; i++) {
			
			if(bs(Integer.parseInt(st.nextToken()))) {
				
			} else {
				
			}
		}
		
		
	}
	
	public static boolean bs(int val) {
		return false;
	}

}
