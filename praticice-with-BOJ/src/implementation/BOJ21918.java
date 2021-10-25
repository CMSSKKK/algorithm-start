package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ21918 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());
		int co = Integer.parseInt(st.nextToken());
		int[] bulbs = new int[N+1];
		
		st = new StringTokenizer(br.readLine()," ");
		for (int i = 1; i <= N; i++) {
			bulbs[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < co; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int command = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			switch (command) {
				case 1: bulbs[a] = b;					
					break;
					
				case 2:	
					for (int j = a; j <= b; j++) {
						if(bulbs[j] == 0 ) {
							bulbs[j] = 1;
						} else bulbs[j] = 0;
					}
					break;
					
				case 3: 
					for (int j = a; j <= b; j++) {
					bulbs[j]  =0;
					}
					break;
					
				case 4:
					for (int j = a; j <= b; j++) {
						bulbs[j] = 1;
					}
					break;	
				}
		}
		
		for (int i = 1; i < bulbs.length; i++) {
			System.out.print(bulbs[i]+" ");
		}
		
	
	
	
	}

}
