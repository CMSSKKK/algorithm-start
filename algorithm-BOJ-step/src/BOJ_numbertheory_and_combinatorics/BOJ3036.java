package BOJ_numbertheory_and_combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ3036 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] radii = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for (int i = 0; i < radii.length; i++) {
			radii[i] = Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < radii.length; i++) {
			int value = gcd(radii[0], radii[i]); 
			sb.append(radii[0]/value).append('/').append(radii[i]/value).append('\n');
		}
		
		System.out.print(sb);
	}
	
	public static int gcd(int a, int b) {
		while (b != 0) {
			int r = a %b;
			a = b;
			b = r;
		}
		return a;
	}
}
