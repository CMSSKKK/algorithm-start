package baek_basicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class baek1193 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub							
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		
		int cross = 1, sum = 0;
		 
		while (true) {
			if (X <= sum + cross) {	
				
				if (cross % 2 == 1) {	
					System.out.println((cross - (X - sum - 1)) + "/" + (X - sum));					
					break;
				} 
				
				else {	
					System.out.println((X - sum) + "/" + (cross - (X - sum - 1)));			
					break;
				}
 
			} else {
				sum += cross;
				cross++;
			}
		}
		
		
		int count = 1;
		String s;
		
		do {	
			// System.out.println("½ÃÀÛ X : "+X+" count : "+count);
			X -= count;
			// System.out.println("»« X : "+X);
			count++;			
			// System.out.println("´õÇÑ count : "+count);
		}
		while(X > 0);		
		
		if((count-1) % 2 == 1) {
			s = (1-X) + "/" + (count-(1-X));
		}
		else {
			s = (count-(1-X)) + "/" + (1-X);
		}
		System.out.println(s);
		
	}
}