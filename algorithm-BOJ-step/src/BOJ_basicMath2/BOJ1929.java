package BOJ_basicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1929 {
	public static boolean prime[];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int M =Integer.parseInt(st.nextToken());
		int N =Integer.parseInt(st.nextToken());
		
		prime =new boolean[N+1];
		getPrime();
		
		StringBuilder sb = new StringBuilder();
		for (int i = M; i <=N; i++) {
			if(prime[i]==false)
				sb.append(i).append('\n');
		}
		System.out.println(sb);
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
