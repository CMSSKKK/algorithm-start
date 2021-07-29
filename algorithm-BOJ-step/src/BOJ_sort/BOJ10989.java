package BOJ_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10989 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		// 카운팅 정렬
		int[] arr = new int[10001];
		
		for (int i = 0; i < N; i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		
				
		for (int i = 1; i < arr.length; i++) {
			while(arr[i] > 0) {
				sb.append(i).append('\n');
				arr[i]--;
			}
		}
		System.out.print(sb);
	}
}
