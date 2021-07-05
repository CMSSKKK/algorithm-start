package baek_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class baek2562 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 		
		int input[] = new int[9];		
		
		int max = 0;
		int index = 0;
		int count = 0;
		for (int i = 0; i < 9; i++) {			
			input[i] =Integer.parseInt(br.readLine());
			count++;
			if(input[i] > max) {
				max = input[i];
				index = count; 
			}
		}																											
		System.out.println(max);
		System.out.println(index);
		
	}
}
