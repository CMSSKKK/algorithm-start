package BOJ_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ13305 {
		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		long[] distance = new long[N-1];
		long[] oilCost = new long[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < distance.length; i++) {
			distance[i] = Long.parseLong(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < oilCost.length; i++) {
			oilCost[i] = Long.parseLong(st.nextToken());
		}
		
		long sum = 0;
		long minCost = oilCost[0];
		
		for (int i = 0; i < N-1; i++) {
			
			if(oilCost[i] < minCost) {
				minCost= oilCost[i];
			}
			
			sum += (minCost * distance[i]);
		}
		System.out.println(sum);
	}

}
