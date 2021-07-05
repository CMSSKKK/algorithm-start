package baek_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class baek8958 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());							
		 
		String ox[] = new String[N];
		StringBuilder sb = new StringBuilder();				
		for (int i = 0; i < N; i++) {
			ox[i] = br.readLine();
			int count = 0;	
			int sum = 0;	
			
			for (int j = 0; j < ox[i].length(); j++) {
				
				if (ox[i].charAt(j) == 'O') {
					count++;
				} else {
					count = 0;
				}
				sum+=count;
			}
			
			sb.append(sum).append('\n');
		}
		
		System.out.print(sb);
	}
}
