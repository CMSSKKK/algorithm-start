package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ21758 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int[] honey = new int[N];
		
 		for (int i = 0; i <N; i++) {
			honey[i] = Integer.parseInt(st.nextToken());
		}
		
 		long[] sum = new long[N];
 		sum[0] = honey[0];
 		for (int i = 1; i < sum.length; i++) {
			sum[i] = sum[i-1]+honey[i];
		}
 		long max = 0;
 		if(N == 3) {
 			for(int i = 0; i < N; i++) {
 				max = Math.max(max, 2*honey[i]);
 			}
 			System.out.println(max);
 			System.exit(0);
 		}
 		for (int i = 1; i < N-1; i++) {
			max = Math.max(max, sum[i-1] - honey[0] + honey[i]);
		}
 		for (int i = 1; i < N-1; i++) {
			max = Math.max(max, (2*sum[N-1])-honey[0]-honey[i]-sum[i]);
		}
 		for (int i = 1; i < N-1; i++) {
			max = Math.max(max, 2*sum[i-1]+sum[N-2]-sum[i]);
		}
 		System.out.println(max);
	}

}
