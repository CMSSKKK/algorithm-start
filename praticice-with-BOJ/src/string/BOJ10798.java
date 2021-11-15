package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10798 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = new String[5];
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = br.readLine();
			if(arr[i].length() > max) {
				max = arr[i].length();
			}
		}
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < max; i++) {
			
			for (int j = 0; j < arr.length; j++) {
				if(arr[j].length() > i ) {
					sb.append(arr[j].charAt(i));
				}
				
			}
		}
		
		System.out.println(sb.toString());
	}

}
