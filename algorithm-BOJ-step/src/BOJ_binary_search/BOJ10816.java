package BOJ_binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ10816 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < M; i++) {
			int val = Integer.parseInt(st.nextToken());
			int result = upper(arr, val) - lower(arr, val);
			sb.append(result).append(" ");
		}
		System.out.println(sb);
	}
	
	public static int lower(int[] arr, int val) {
		int start = 0;
		int last = arr.length;
		
		while(start < last) {
			int mid = (start+last)/2;
			
			if(val <= arr[mid]) {
				last = mid;
			} else {
				start = mid + 1;
			}
		}
		return start;
		
	}
	
	public static int upper(int[] arr, int val) {
		int start = 0;
		int last = arr.length;
		
		while(start < last) {
			int mid = (start+last)/2;
			
			if(val < arr[mid]) {
				last = mid;
			} else {
				start = mid + 1;
			}
		}
		return start;
	}
}
