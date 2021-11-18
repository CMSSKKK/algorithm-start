package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ6550ver2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb= new StringBuilder();
		while(true) {

			String line = br.readLine();				
			if(line == null) break;
			
			st = new StringTokenizer(line);
			String s1 = st.nextToken();
			String s2 = st.nextToken();
			
			boolean possible = true;
			int pre = -1;
			
			for (int i = 0; i < s1.length(); i++) {
				int cur = s2.indexOf(s1.charAt(i), pre+1);
				if(cur == -1) {
					possible = false;
					break;
				}
				pre = cur;
			}
			
			if(possible) {
				sb.append("Yes").append('\n');
			} else {
				sb.append("No").append('\n');
			}
		}
		System.out.println(sb);
	}
}
