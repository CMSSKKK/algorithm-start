package BOJ_bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2231 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		
		int numLength =num.length(); // 자릿수
		
		int N = Integer.parseInt(num);
		
		int constructor = 0;
		
		// N보다 작은 수에 대해 모두 조회하기 
		// for (int i = 0; i < N; i++) {
		
		// 생성자가 나올 수 있는 최솟값부터 조회하기 
		for (int i = N-(numLength*9); i < N; i++) { 
			int number = i;
			int sum = 0;
			
			while(number != 0) { // 자릿수 더하기 
				sum += number % 10;
				number /= 10;
			}
			
			if(sum + i == N) { // 생성자를 찾았을 때 
				constructor = i;
				break;
			}
		}
		System.out.println(constructor);
	}
	
}
