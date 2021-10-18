package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BOJ21314 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String mkNum = br.readLine();
		int len = mkNum.length();
		StringBuilder max = new StringBuilder();
		StringBuilder min = new StringBuilder();
		int count = 0;
		for (int i = 0; i < len; i++) {
			char temp = mkNum.charAt(i);
			
			if(temp == 'M' ) {
				if(count == 0 ) {
					min.append("1");
				} else {
					min.append("0");
				}
				count++;
			} else {
				max.append("5");
				min.append("5");
				if(count != 0 ) {
					for (int j = 0; j < count; j++) {
						max.append("0");
					}
				}
				count =0;
			}
		}
		
		if(count != 0 ) {
			for (int i = 0; i < count; i++) {
				max.append("1");
			}
		}
		
		System.out.println(max);
		System.out.println(min);
		
	}

}
