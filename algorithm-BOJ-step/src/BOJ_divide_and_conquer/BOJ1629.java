package BOJ_divide_and_conquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1629 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long C = Long.parseLong(st.nextToken());
		
		System.out.println(pow(A,B,C));
		
	}
	
	public static long pow(long a, long b, long c) {
		
		if(b == 1) {
			return a % c;
		}
		
		long divided = pow(a, b/2, c);
		
		if(b % 2 == 1) {
			return (divided * divided % c) * a % c;
		}
		
		return divided * divided % c;
	}

}
