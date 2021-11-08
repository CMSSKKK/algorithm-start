package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11365ver2 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String temp = br.readLine();
			
			if(temp.equals("END")) {
				break;
			}
			
			for (int i = temp.length()-1; i >= 0; i--) {
				sb.append(temp.charAt(i));
			}
			sb.append('\n');
		}
		
		System.out.println(sb);
	}
}
