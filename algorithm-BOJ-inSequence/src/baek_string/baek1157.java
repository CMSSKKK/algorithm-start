package baek_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek1157 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int[] arr = new int[26]; // 알파벳 수
		String s = br.readLine();
		
 
		for (int i = 0; i < s.length(); i++) {
			if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
				arr[s.charAt(i) - 97]++; // 소문자
			} else {
				arr[s.charAt(i) - 65]++; // 대문자
			}
		}
		int max = -1;
		char result = '?';
		for (int i = 0; i < 26; i++) {
 
			if (arr[i] > max) {
				max = arr[i];
				result = (char) (i + 65);
			} 
			else if (arr[i] == max) {
				result = '?';
			}
		}
		System.out.print(result);
	}

}
