package BOJ_bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1436 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int devil = 666;
		int count = 1;
	
		while(count != N) {
			devil++;
			
			if(String.valueOf(devil).contains("666")) {
				count++;
			}
			
		}
		System.out.println(devil);
		
	}

}
