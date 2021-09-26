package BOJ_dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11054 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int[] A = new int[N];
		int[] right = new int[N];
		int[] reverse = new int[N];
		
		for(int i =0; i < N; i++ ) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < N; i++) {
			right[i] = 1;
			
			for (int j = 0; j < i; j++) {
				
				if(A[j] < A[i] && right[i] < right[j]+1) {
					right[i] = right[j]+1;
				}
			}
			
		}
		
		for(int i = N-1; i >=0; i--) {
			reverse[i] = 1;
			
			for(int j =N-1; j>i; j--) {
				
				if(A[j]<A[i] && reverse[i] <reverse[j]+1) {
					reverse[i]= reverse[j]+1;
				}
			}
		}
		
		int max = 0 ;
		for (int i = 0; i < N; i++) {
			int val = (right[i]+reverse[i]);
			max = max < val ? val : max;
		}
		
		System.out.println(max-1);
	}

}
