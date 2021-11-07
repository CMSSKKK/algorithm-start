package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ3029 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[] h = new int[2];
		int[] m = new int[2];
		int[] s = new int[2];
		
		for (int i = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine(),":");
			h[i] = Integer.parseInt(st.nextToken());
			m[i] = Integer.parseInt(st.nextToken());
			s[i] = Integer.parseInt(st.nextToken());			
		}
		int[] time = new int[3];
		
		
		if(s[0] >s[1]) {
			s[0]= 60 - s[0];
			time[2] = s[0]+s[1];
			m[0]+=1;
		} else {
			time[2] = s[1] - s[0];
		}
		
		if(m[0] > m[1]) {
			m[0] = 60 - m[0];
			time[1] = m[0]+m[1];
			h[0]+=1;
		} else {
			time[1] = m[1]-m[0];
		}
		
		if(h[0] > h[1]) {
			h[0] = 24 - h[0];
			time[0] = h[0]+h[1];	
		} else {
			time[0] = h[1]-h[0];
		}
		
		int count = 0;
		for (int i = 0; i < time.length; i++) {
			if(time[i] == 0 ) {
				count++;
			}
		}
		
		if(count == 3) {
			System.out.println("24:00:00");
			return;
		} else {
			System.out.printf("%02d:%02d:%02d", time[0], time[1], time[2]);
		}
		
		
		
		
	}

}
