package BOJ_bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2798 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] card = new int[N];
		
		st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < N; i++) {
			card[i] =Integer.parseInt(st.nextToken());			
		}
		System.out.println(blackJack(card, N, M));
		
	}
	
	public static int blackJack(int[] card, int number, int sum) {
		int maxSum = 0;
		for (int i = 0; i < number - 2 ; i++) {
			if(card[i] > sum) continue;
			
			for (int j = i+1; j < number -1; j++) {
				if(card[i]+card[j] > sum) continue;
				
				for (int k = j+1; k < number; k++) {
					int temp = card[i]+card[j]+card[k];
					
					if(sum == temp) return temp;
					
					if(maxSum < temp && temp < sum) {
						maxSum = temp;
					}
				}
			}
		}
		
		return maxSum;
	}
}
