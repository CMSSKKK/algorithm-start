package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11720 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		br.readLine();
//		
//		String str = br.readLine();
//		char[] num = str.toCharArray();
//		int sum = 0;
//		
//		for (int i = 0; i < num.length; i++) {
//			sum += num[i]-'0';
//		}
//		System.out.println(sum);
		
		br.readLine();
		int sum = 0;
		for (Byte value : br.readLine().getBytes()) {
			sum += value -'0';
		}
		System.out.println(sum);
	}

}
