package string;

import java.io.IOException;
import java.util.Scanner;

public class BOJ6550 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		boolean p = false;
		
		while(sc.hasNext()) {
			String[] str = sc.nextLine().split(" ");
			
			p = possible(str[0],str[1]);
			
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
		boolean possible = false;
		for (int i = 0; i < full.length(); i++) {
			
			char temp = full.charAt(i);
			
			if(sub.charAt(index) == temp) {
				index++;
			} 
			
			if(index == sub.length()) {
				possible = true;
				break;
			}
		}

		return possible;
	}
}
