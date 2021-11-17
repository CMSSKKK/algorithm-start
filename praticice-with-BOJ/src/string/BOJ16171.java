package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ16171 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String memo = br.readLine();
		String keyword = br.readLine();
		memo = memo.replaceAll("[0-9]", "");
		
		for (int i = 0; i <= memo.length() - keyword.length(); i++) {
			if(memo.substring(i, i+keyword.length()).equals(keyword)) {
				System.out.println(1);
				return;
			}
		}
		System.out.println(0);
				
	}

}
