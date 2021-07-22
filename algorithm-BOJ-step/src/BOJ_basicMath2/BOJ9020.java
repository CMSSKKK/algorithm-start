package BOJ_basicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9020 {
	
	public static boolean[] prime = new boolean[10001];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		getPrime();
		
		while(T-- > 0) {
			int N = Integer.parseInt(br.readLine());
			int part1 = N / 2;
			int part2 = N / 2;
			
			while (true) {
				
				if(!prime[part1] && !prime[part2]) {
					sb.append(part1).append(' ').append(part2).append('\n');
					break;
				}
				part1--;
				part2++;
			}
		}
		System.out.println(sb);
	}
	
	public static void getPrime() {
		prime[0] = true;
		prime[1] = true;
		
		for (int i = 2; i < Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for (int j = i*i; j < prime.length; j=j+i) { 
				prime[j]= true;
			}
		}
	}
}
