package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ20365 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		char[] questions = br.readLine().toCharArray();
		int b = 0;
		int r = 0;
		
		for (int i = 0; i < N; i++) {
			int temp = questions[i];
			
			if(temp == 'B') {
				b++;
				while(i+1 < N) {
					if(questions[i+1] != 'B') {
						break;
					}
					i++;
				}
		
			} else { 
				r++;
				while(i+1 < N) {
					if(questions[i+1] != 'R') {
						break;
					}
					i++;
				}
			}
				
				
		
		}
		int min = Math.min(r, b);
		System.out.println(min+1);
	}
}
