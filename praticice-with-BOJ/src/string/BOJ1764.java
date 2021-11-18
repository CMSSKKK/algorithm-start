package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ1764 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Map<String,Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			map.put(input, map.getOrDefault(input, 0)+1);
		}
		for (int i = 0; i < M; i++) {
			String input = br.readLine();
			map.put(input, map.getOrDefault(input, 0)+1);
		}
		ArrayList<String> list = new ArrayList<>();
		
		for (String key : map.keySet()) {
			if(map.get(key) == 2) {
				list.add(key);
			}
		}
		Collections.sort(list);
		System.out.println(list.size());
		for (String str : list) {
			System.out.println(str);
		}
	}

}
