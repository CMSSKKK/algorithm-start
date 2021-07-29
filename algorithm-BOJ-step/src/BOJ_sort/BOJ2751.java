package BOJ_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ2751 {
	 
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		// 카운팅 정렬
		boolean[] arr = new boolean[2000001];
		
		for (int i = 0; i < N; i++) {
			arr[Integer.parseInt(br.readLine()) + 1000000] = true;
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]) {
				sb.append(i-1000000).append('\n');
			}
		}
		System.out.print(sb);
		
//		ArrayList<Integer> list = new ArrayList<>();
//		
//		for (int i = 0; i < N; i++) {
//			list.add(Integer.parseInt(br.readLine()));
//		}
//		
//		Collections.sort(list);
//		
//		for (int num : list) {
//			sb.append(num).append('\n');
//		}
//		System.out.print(sb);
	}

}
