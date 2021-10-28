package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.StringTokenizer;
import java.util.TreeMap;


public class BOJ20291 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		SortedMap<String,Integer> map = new TreeMap<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				int len = o1.length();
				int a = 0;
				int b = 0;
				while (len-- >= 0 ) {
					
					int i = 0;
					
					a = o1.charAt(i);
					b = o2.charAt(i);
					i++;
					if(a != b) break;
				}
				
				return a-b;
			}
		});
		for (int i = 0; i <N; i++) {
			st = new StringTokenizer(br.readLine(),".");
			st.nextToken();
			String key = st.nextToken();
			map.put(key, map.getOrDefault(key, 0)+1);
		}
		StringBuilder sb = new StringBuilder();
		for (String key : map.keySet()) {
			sb.append(key).append(" ").append(map.get(key)).append('\n');
		}
		System.out.println(sb);
	}

}
