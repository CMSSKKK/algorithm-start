package baek_for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek10871 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 StringTokenizer st = new StringTokenizer(br.readLine()," ");
		 int N = Integer.parseInt(st.nextToken());
		 int X = Integer.parseInt(st.nextToken());
		 int [] array = new int [N];
		 
		 StringBuilder sb=new StringBuilder(); 
		 StringTokenizer stk = new StringTokenizer(br.readLine()," ");
		 
		for (int i = 0; i < N; i++) {			
			array[i] = Integer.parseInt(stk.nextToken());
			if( array[i] < X ) {
				sb.append(array[i]+" ");					
			}
		}
		br.close();
		System.out.println(sb);
		
		
	}
}
