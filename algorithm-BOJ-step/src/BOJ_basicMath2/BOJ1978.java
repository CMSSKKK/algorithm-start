package BOJ_basicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1978 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int isPrime =0;
		for (int i = 0; i < N; i++) {
			isPrime += prime(Integer.parseInt(st.nextToken()));			
		}
		System.out.println(isPrime);
		
	}
	
	public static int prime(int number) {
		
		if(number < 2) {
			return 0;
		}
		if(number == 2) {
			return 1;
		}
		for (int i = 2; i < number; i++) {
			
			if(number % i ==0) {
				return 0;
			}
		}
		return 1;
	}
}
