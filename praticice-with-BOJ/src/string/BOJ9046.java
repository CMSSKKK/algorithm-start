package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9046 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String temp = "";
		int[] alpa;
		int max;
		char ans;
		while(N-->0) {
			alpa = new int[26];
			temp = br.readLine();
			
			for (int i = 0; i < temp.length(); i++) {
				char c = temp.charAt(i);
				if('a'<= c && c <= 'z') {
					alpa[temp.charAt(i)-97]++;
				}
				
			}
			max = Integer.MIN_VALUE;
			ans ='?';
			for (int i = 0; i < alpa.length; i++) {
				if(alpa[i]> max) {
					max = alpa[i];
					ans = (char)(i+97);
				} else if (alpa[i] == max) {
					ans = '?';
				}
			}
			System.out.println(ans);
		}
	}

}
