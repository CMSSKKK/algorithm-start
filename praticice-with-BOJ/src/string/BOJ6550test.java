package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ6550test {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String input ="";
		while((input = br.readLine()) != null) {
			
			st = new StringTokenizer(input," ");
			String sub = st.nextToken();
			String full = st.nextToken();
			boolean p = possible(sub, full);
			
			if(p) {
				sb.append("Yes").append('\n');
			} else {
				sb.append("No").append('\n');
			}
		
		}
		System.out.println(sb);
	}
	
	static boolean possible(String sub, String full) {
		int index = 0;
		
		for (int i = 0; i < full.length(); i++) {
			
			char temp = full.charAt(i);
			
			if(sub.charAt(index) == temp) {
				index++;
			} 
			
			if(index == sub.length()) {
				return true;
			}
		}

		return false;
	}
}
