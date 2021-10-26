package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ14467 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Map<Integer,Integer> map = new HashMap<>();
		StringTokenizer st;
		int[] cows = new int[N+1];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int key = Integer.parseInt(st.nextToken());
			int loc = Integer.parseInt(st.nextToken());
			if(map.containsKey(key)) {
				if(!map.get(key).equals(loc)) {
					cows[key]++;
					map.replace(key, loc);
				}
				
			}
			else {
				map.put(key, loc);
			}
		}
		int sum = 0;
		for (int i = 0; i < cows.length; i++) {
			sum += cows[i];
		}
		System.out.println(sum);
	}
}
