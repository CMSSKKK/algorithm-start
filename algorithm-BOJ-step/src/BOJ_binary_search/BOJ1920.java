package BOJ_binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1920 {
		public static int[] numN;
		
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		numN = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < numN.length; i++) {
			numN[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(numN);
		
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < M; i++) {
			
			if(bs(Integer.parseInt(st.nextToken())) >= 0) {
				sb.append(1).append('\n');
			} else {
				sb.append(0).append('\n');
			}
		}
		
		System.out.println(sb);
	}
	
	public static int bs(int val) {
		int start = 0;
		int last = numN.length-1;
		
		while(start <= last) {
			
			int mid = (start+last)/2;
			
			if(val < numN[mid]) {
				last = mid-1;
			} else if(val > numN[mid]) {
				start = mid+1;
			} else {
				return mid;
			}
		}
		
		return -1;
	}

}
