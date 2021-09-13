package BOJ_numbertheory_and_combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2004 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int twoResult = two(N)-two(N-M)-two(M);
		int fiveResult = five(N)-five(N-M)-five(M);

		System.out.println(Math.min(twoResult, fiveResult));
	}
	
	public static int two(int num) {
		int count = 0;
		while(num>=2) {
			count += num/2;
			num /= 2;
		}
		return count;
	}
	
	public static int five(int num) {
		int count = 0;
		while(num>=5) {
			count += num/5;
			num /= 5; 
		}
		
		return count;
	}

}
