package BOJ_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1427 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String N =br.readLine();
		int len =N.length();
		int[] num = new int[len];
		for (int i = 0; i < num.length; i++) {
			num[i] = N.charAt(i)-48;			
		}
		//버블 정렬
		for (int i = 0; i < len-1; i++) {
			for (int j = i+1; j < len; j++) {
				if(num[i] < num[j]) {
					int temp = num[j];
					num[j] = num[i];
					num[i] = temp;
				}
			}
		}
		for (int number : num) {
			System.out.print(number);
		}
	
		
//		char[] number = br.readLine().toCharArray();
//		
//		Arrays.sort(number);
//		
//		for (int i = number.length -1; i >= 0; i--) {
//			System.out.print(number[i]);
//			
//		}
		
		
	}
}
