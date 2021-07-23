package BOJ_basicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1002 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T =Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine()," ");
			
			int x1 =Integer.parseInt(st.nextToken());
			int y1 =Integer.parseInt(st.nextToken());
			int r1 =Integer.parseInt(st.nextToken());
			
			int x2 =Integer.parseInt(st.nextToken());
			int y2 =Integer.parseInt(st.nextToken());
			int r2 =Integer.parseInt(st.nextToken());
			
		}
	}

}
