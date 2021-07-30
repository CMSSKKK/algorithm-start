package BOJ_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1427 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String N =br.readLine();
		int len =N.length();
		int[] str = new int[len];
		for (int i = 0; i < str.length; i++) {
			str[i] = N.charAt(i)-48;			
		}
		//버블 정렬
		for (int i = 0; i < len-1; i++) {
			for (int j = i+1; j < len; j++) {
				if(str[i] < str[j]) {
					int temp = str[j];
					str[j] = str[i];
					str[i] = temp;
				}
			}
		}
		for (int num : str) {
			System.out.print(num);
		}
	
	}

}
