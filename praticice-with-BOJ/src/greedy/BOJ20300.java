package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ20300 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		long[] machines = new long[N];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < machines.length; i++) {
			machines[i] = Long.parseLong(st.nextToken());
		}
		Arrays.sort(machines);
		long[] sumArr;
		long min = 0;
		int index = 0;
		if(N%2 == 0) {
			sumArr = new long[N/2];
			for (int i = 0; i < sumArr.length; i++) {
				index++;
				sumArr[i] = machines[i]+machines[N-index];
				if(min < sumArr[i]) {
					min = sumArr[i];
				}
			}
			
		} else {
			sumArr = new long[N/2+1];
			for (int i = 0; i < sumArr.length-1; i++) {
				index++;
				sumArr[i] = machines[i]+machines[N-index-1];
				if(min < sumArr[i]) {
					min = sumArr[i];
				}
			}
			sumArr[N/2] = machines[N-1];
			min = Math.max(min, sumArr[N/2]);
		
		}
		
		System.out.println(min);
	}

}
