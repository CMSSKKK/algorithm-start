package BOJ_basicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ4153 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			
			StringTokenizer st = new StringTokenizer(br.readLine()," ");			
			
			int a =Integer.parseInt(st.nextToken());		
			int b =Integer.parseInt(st.nextToken());
			int c =Integer.parseInt(st.nextToken());
			
			if(a == 0 && b ==0 && c == 0 )
				break;
			
			if((c*c)==(a*a)+(b*b)) {
				sb.append("right").append('\n');
			}
			else if((a*a)==(c*c)+(b*b)) {
				sb.append("right").append('\n');
			}
			else if((b*b)==(c*c)+(a*a)) {
				sb.append("right").append('\n');
			}
			else {
				sb.append("wrong").append('\n');
			}
		}
		
		System.out.println(sb);
		
	}

}
