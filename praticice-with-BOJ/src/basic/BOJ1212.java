package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1212 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String N = br.readLine();
		
		int len = N.length();
		StringBuilder sb = new StringBuilder();
		String temp = Integer.toBinaryString(N.charAt(0) - '0');
		sb.append(temp);
		
		for (int i = 1; i < len; i++) {
			temp = Integer.toBinaryString(N.charAt(i) - '0');
			
			if(temp.length() == 2) {
				temp = "0"+temp;
			}
			
			else if(temp.length() == 1) {
				temp = "00"+temp;
			}
			sb.append(temp);
		}
		
		System.out.println(sb);
	}
	
	
}
