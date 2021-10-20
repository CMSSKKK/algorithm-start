package BOJ_two_pointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ3273 {
	
 	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int val = Integer.parseInt(br.readLine());
		
		System.out.println(pairCount(arr, N, val)); 
		
	}
	
	static int pairCount(int[] arr, int length, long val ) {
		int p1 = 0;
		int p2 = length-1;
		int count = 0;
		while (p1 < p2 ) {

			int temp = arr[p1] + arr[p2];
			
			if(arr[p1] + arr[p2] == val) {
				count++;
				p1++;
				p2--;
			} else if ( temp > val ) {
				p2--;
			} else {
				p1++;
			}
		}
		return count;
	}

}
