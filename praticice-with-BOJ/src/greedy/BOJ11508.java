package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ11508 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Integer[] products = new Integer[N];
		
		for (int i = 0; i < products.length; i++) {
			products[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(products, Comparator.reverseOrder());
		int temp = 0;
		int sum = 0;
		
		for (int i = 0; i < products.length; i++) {
			
			if((i+1) % 3 == 0) {
				sum += temp;
				temp = 0;
			} else {
				temp += products[i];
			}
						
		}
		sum += temp;
		System.out.println(sum);
		
	}

}
