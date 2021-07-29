package BOJ_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class BOJ2750 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i]= Integer.parseInt(br.readLine());
		}
		
		//버블 정렬
		for (int i = 0; i < N-1; i++) {
			for (int j = i+1; j < N; j++) {
				if(arr[i]> arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		// Arrays.sort(arr);
		
		for (int num : arr) {
			System.out.println(num);
		}
	}
	
}
