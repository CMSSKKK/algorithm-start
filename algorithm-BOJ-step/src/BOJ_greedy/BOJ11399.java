package BOJ_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class BOJ11399 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] time = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for (int i = 0; i < time.length; i++) {
			time[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(time);
		int sum = 0;
		int next = 0;
		for (int i : time) {
			next += i;
			sum += next;
		}
		System.out.println(sum);
	}

}
