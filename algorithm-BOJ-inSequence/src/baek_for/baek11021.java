package baek_for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek11021 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     int T = Integer.parseInt(br.readLine());		
		
	     StringTokenizer st;
		 StringBuilder sb=new StringBuilder(); 
	
		for (int i = 1; i < T+1; i++) {
			st=new StringTokenizer(br.readLine()," ");
			sb.append("Case #"+i+": ");
			sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));
			sb.append('\n');
			
		}
		br.close();
		System.out.println(sb);
		
		
	}
}
