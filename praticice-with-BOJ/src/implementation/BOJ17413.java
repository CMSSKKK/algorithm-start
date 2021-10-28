package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ17413 {
	static char[] input;
	static StringBuilder sb;
	static int next = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		input = br.readLine().toCharArray();
		sb = new StringBuilder();
		
		while(next < input.length) {
			
			char temp = input[next];
			if(temp == '<') {
				tag(next);
			}
			else {
				reverse(next);				
			}
		}
		
	}
	static void reverse(int index) {
		
	}
	static void tag(int index) {
		
	}
}
