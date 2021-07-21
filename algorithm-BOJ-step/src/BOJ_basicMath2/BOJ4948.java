package BOJ_basicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ4948 {
	public static boolean[] prime = new boolean[246913]; // 1 <= n <= 123456
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		getPrime();
		while(true) { 
			int N =Integer.parseInt(br.readLine());
			
			if(N == 0) break;
						
			int count = 0;
			for (int i =N+1; i <= N*2; i++) {
				if(prime[i]==false) 
					count++;
									
			}			
				System.out.println(count);
				
		}
	}	
	
	public static void getPrime() {
		prime[0] = true;
		prime[1] = true;
		
		for (int i = 2; i < Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for (int j = i*i; j < prime.length; j=j+i) { // i를 제외한 i의 배수들을 제외시킨다
				prime[j]= true;
			}
		}
	}
}
