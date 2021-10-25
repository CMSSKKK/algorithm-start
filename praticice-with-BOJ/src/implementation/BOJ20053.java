package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ20053 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int min;
		int max;
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) {
			int temp = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine()," ");
			min = Integer.MAX_VALUE;
			max = Integer.MIN_VALUE;
			for (int j = 0; j < temp; j++) {
				int num = Integer.parseInt(st.nextToken());
				max = Math.max(max, num);
				min = Math.min(min, num);
			}
			sb.append(min).append(" ").append(max).append('\n');
		}
		
		System.out.println(sb.toString());
	}
	
}
