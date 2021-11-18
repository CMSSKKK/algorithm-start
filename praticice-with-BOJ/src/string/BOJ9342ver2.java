package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9342ver2 {
	
	public static void main(String[] args) throws IOException {
		String pattern = "^[A-F]?A+F+C+[A-F]?$";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			String str = br.readLine();
			if(check(str)) {
				sb.append("Infected!").append('\n');
			} else {
				sb.append("Good").append('\n');
			}
		}
		System.out.println(sb);
		
	}
	
	static boolean check(String input) {
		String pattern = "^[A-F]?A+F+C+[A-F]?$";
		
		return input.matches(pattern);
	}
}
