package BOJ_basicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11653 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int N = Integer.parseInt(br.readLine());		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 2; i*i <= N; i++) {
			while(N % i == 0) {
				sb.append(i).append('\n');
				N /= i;
			}
		}
		
		if(N!=1) sb.append(N);
		
		System.out.println(sb);
	}

}
