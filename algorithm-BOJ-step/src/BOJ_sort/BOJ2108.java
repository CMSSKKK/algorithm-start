package BOJ_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BOJ2108 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[8001];
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int median = 10000;
		int mode = 10000;
		
		for (int i = 0; i < N; i++) {
			int number =Integer.parseInt(br.readLine());
			sum += number;
			arr[number+ 4000]++;
			
			if(max < number) {
				max = number;
			}
			
			if(min > number) {
				min = number;
			}
		}
		
		int count = 0;
		int maxMode = 0;
		
		boolean flag  = false;
		
		for (int i = min+4000; i <= max+4000; i++) {
			
			if(arr[i] > 0) {
				if(count < (N+1) / 2) {
					count += arr[i];
					median = i - 4000;
				}
				if(maxMode < arr[i]) {
					maxMode = arr[i];
					mode = i- 4000;
					flag = true;
				}
				else if(maxMode == arr[i] && flag == true) { // 빈도가 같은 수가 여러 개라면 두 번째로 작은 수를 출력하기 때문에 한번 수행 후 flag를 false로 바꿔 준다.
					mode = i - 4000;
					flag = false;
				}
			}			
		}
		System.out.println((int)Math.round((double)sum / N));
		System.out.println(median);
		System.out.println(mode);
		System.out.println(max - min);
		
	}

}
