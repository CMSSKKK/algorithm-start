package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ4659 {
	
	static char[] v = {'a','e','i','o','u'};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp;
		StringBuilder sb = new StringBuilder();
		
		while(!(temp=br.readLine()).equals("end")) {
			sb.append('<').append(temp).append('>');
			if(solve(temp)) {
				sb.append(" is acceptable.").append('\n');
			} else {
				sb.append(" is not acceptable.").append('\n');
			}			
		}
		
		System.out.println(sb.toString());
	}
	
	static boolean solve(String input) {
		char temp[] = input.toCharArray();
		boolean possible = true;
		int vCnt = 0;
		int cCnt = 0;
		int p = 0;
		char pre = 'A';
		for (int i = 0 ; i < temp.length; i++) {
			if(isVowel(temp[i])) {
				p++;
				vCnt++;
				cCnt = 0;				
			} else {
				cCnt++;
				vCnt = 0;	
			}
			// 모음 혹은 자음이 3번 반복되는지 확인 
			if( vCnt == 3 || cCnt == 3) {
				possible = false;
				break;
			}
			// 같은 알파벳 연속되는지 확인 
			if(pre == temp[i]) {
				if( pre == 'e' || pre =='o') {
					possible = true;
				} else {
					possible = false;
					break;
				}
			}
			
			pre = temp[i];
			
			
		}
		// 모음이 최소 1개는 있는지 확인 
		if(p == 0) {
			possible = false;
		}
		
		return possible;
	}
	
	static boolean isVowel(char c) {
		for (int i = 0; i < v.length; i++) {
			if(v[i] == c) {
				return true;
			}
		}
		return false;
	}
	

}
