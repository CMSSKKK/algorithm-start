package baek_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class baek2941 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		String s= br.readLine();
		int slen =s.length();
		int count=0;
		for (int i = 0; i < slen; i++) {
			
			char ch = s.charAt(i);
			
			if(ch =='c' && i < slen-1) {
				if(s.charAt(i+1) =='=' || s.charAt(i+1) =='-') {
					i++;
				}
			}
			else if(ch =='d' && i < slen-1) {
				if(s.charAt(i+1) =='-') {	
						i++;
					}
				else if(s.charAt(i+1) =='z' && i < slen-2) {
					
					if(s.charAt(i+2) =='=') {	
						i+= 2;
					}
				}
			}
		    
			else if((ch =='l' || ch =='n') && i < slen-1) {
				if(s.charAt(i+1) =='j') {	
					i++;
				}
			}
		    
 
			else if((ch =='s' || ch =='z') && i < slen-1) {
				if(s.charAt(i+1) =='=') {	
					i++;
				}
			
		    }
		    
			count++;
				
		}
		
		System.out.print(count);
		
	}

}
