package baek_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek10952 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     
	     StringBuilder sb=new StringBuilder(); 
	
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if( a == 0 && b == 0 ) {
				break;
			}
			sb.append(a+b+"\n");						
		}
		br.close();
		System.out.println(sb);
		
		
	}
}
