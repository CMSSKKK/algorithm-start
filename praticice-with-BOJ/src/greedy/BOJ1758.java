package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


public class BOJ1758 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Integer[] forTip = new Integer[N];
		for (int i = 0; i < N; i++) {
			forTip[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(forTip, Comparator.reverseOrder());
		
		long sum = 0;
		
		for (int i = 0; i<N; i++) {
			
			if(forTip[i] -i <=0) {
				break;
			}
				
			sum += forTip[i] -i;
		}
		System.out.println(sum);
	}

}
