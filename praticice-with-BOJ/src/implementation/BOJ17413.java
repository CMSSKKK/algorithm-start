package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ17413 {
	static char[] input;
	static StringBuilder sb;
	static Stack<Character> stack = new Stack<>();
	static boolean[] check;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		input = br.readLine().toCharArray();
		sb = new StringBuilder();
		check = new boolean[input.length];
		for (int i = 0; i < input.length; i++) {
			char temp = input[i];
			if(check[i]== false) {
				if(temp == '<') {
					reversePrint();
					tag(i);
					
				}
				else if(temp ==' ') {
					reversePrint();
					sb.append(' ');
				} else {
					stack.push(input[i]);
					check[i]= true;
					if(i == input.length-1) {
						reversePrint();
					}
				}
			}
		}
		System.out.println(sb);

	}
	static void tag(int index) {
		while(input[index] != '>') {
			sb.append(input[index]);
			check[index] = true;
			index++;
		}
		sb.append(input[index]);
		check[index] = true;
	}
	static void reversePrint() {
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
	}
	
}
