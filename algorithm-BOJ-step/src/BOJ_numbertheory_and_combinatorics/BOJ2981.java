package BOJ_numbertheory_and_combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2981 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		int[] numbers = new int[T];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(numbers);
		
		int value = numbers[1] - numbers[0];
		
		for (int i = 2; i < numbers.length; i++) {
			value = gcd(value, numbers[i]-numbers[i-1]);
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 2; i <= value; i++) {
			
			if(value %i == 0) {
				sb.append(i).append(" ");
			}
		}
		System.out.println(sb);
	}

	
	
	public static int gcd(int a, int b) {
		while(b !=0) {
			int r = a % b;
			a = b;
			b = r;			
		}
		return a;
	}
}
