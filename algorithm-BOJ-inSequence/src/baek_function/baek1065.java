package baek_function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek1065 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(han(Integer.parseInt(br.readLine())));
	}

	public static int han(int number) {
		int count = 0;
		
		if(number < 100) {
			return number;
		} 
		
		else {
			count = 99;
			
			if(number == 1000) {
				number = 999;
			}
			
			for (int i =100; i <= number; i++) {
				int baek = i / 100;
				int sib = (i / 10) %10;			
				int il = i % 10;
				
				if((baek - sib) == (sib - il)) {
					count++;
				}
									
			}
		}
		return count;
	}
}
