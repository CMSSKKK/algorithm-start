package BOJ_basicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class baek1712 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub							
		System.out.println(BEPoint());
	}
	
	public static int BEPoint() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());		
		
			if(B>=C) return -1;
			else return (A/(C-B))+1;
									
	}
}
		
