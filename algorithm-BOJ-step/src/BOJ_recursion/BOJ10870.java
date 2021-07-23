package BOJ_recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10870 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(fibonacciNumber(n));
	}
	public static int fibonacciNumber(int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;				
		return fibonacciNumber(n-1)+fibonacciNumber(n-2);
	}
}
