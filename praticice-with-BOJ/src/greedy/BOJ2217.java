package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2217 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] ropes = new int[N];
		for (int i = 0; i < N; i++) {
			ropes[i]= Integer.parseInt(br.readLine());
		}
		Arrays.sort(ropes);
		int possible = 0;
		int quantity = 0;
		for (int i =ropes.length-1; i >=0; i--) {
			quantity++;
			if(possible < ropes[i]*quantity) {
				possible = ropes[i]*quantity;
			}
			
		}
		System.out.println(possible);
	}

}
