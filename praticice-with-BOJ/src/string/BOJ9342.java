package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9342 {
	
	static char[] arr = {'A','F','C'};
	
	public static void main(String[] args) throws IOException {
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
		// 시작 알파벳 체크 
		boolean start = abcdef(input.charAt(0));
		
		if(start) {
				int index = 1;
				int pre = 0;
				
				while (index < input.length()) {
					char temp =input.charAt(index);
					
					if(abcdef(temp)) {
						// 마지막 알파벳 체크 
						if(index == input.length()-1 && arr[pre] != 'C') {
							if(arr[pre] == 'F' && temp == 'C') {
								return true;
							}
							return false;
						}
						
						
						if(temp == arr[pre]) {
							index++;
						} else if(temp == arr[pre+1]) {
							pre++;
							index++;
						} else {
							return false;
						}
						
					} else {
						return false;
					}
					
				}
			
		} else {
			return false;
		}
		
		return true;
		
	}
	
	static boolean abcdef(char ch) {
		if('A' <= ch && ch <= 'F') {
			return true;
		}
		return false;
	}
}
