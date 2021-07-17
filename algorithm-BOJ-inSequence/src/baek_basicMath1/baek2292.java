package baek_basicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class baek2292 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub							
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = 1;
		int roomCase = 2;
		
		if(N == 1)
			System.out.println("1");
		else {
			while(roomCase <=N) {
				roomCase = roomCase + (6*count);
				count++;
			}		
			System.out.println(count);
		}
						
	}
											
}
		
