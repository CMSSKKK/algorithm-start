package BOJ_numbertheory_and_combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2609 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int res = factorRecur(A, B);
		//int res = factorIter(A, B);
		
		System.out.println(res);
		System.out.println(A*B /res);
	}
	
	public static int factorRecur(int a, int b) {
		if(b == 0)
			return a;
		
		return factorRecur(b, a%b);
	}
	
	public static int factorIter(int a, int b) {
		while ( b!=0 ) {
			int r = a % b;
			
			a = b;
			b = r;
		}
		
		return a;
	}
			
}
