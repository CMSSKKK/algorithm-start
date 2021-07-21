package BOJ_basicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2581 {
	public static boolean prime[];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int M =Integer.parseInt(br.readLine());
		int N =Integer.parseInt(br.readLine());
		
		prime =new boolean[N+1];
		getPrime();
		
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for (int i = M; i <= N; i++) {
			if(prime[i]==false) {
				sum += i;
				if(min == Integer.MAX_VALUE) {
					min = i;
				}
			}
		}
		if(sum ==0)
			System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(min);
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
