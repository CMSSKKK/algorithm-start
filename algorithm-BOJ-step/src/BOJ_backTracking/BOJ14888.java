package BOJ_backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14888 {
	
	public static int minVal = Integer.MAX_VALUE;
	public static int maxVal = Integer.MIN_VALUE;
	public static int[] operator = new int[4];
	public static int[] numbers;
	public static int N;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());		
		numbers = new int[N];
		
		StringTokenizer st= new StringTokenizer(br.readLine()," ");
		
		for (int i = 0; i < N; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine()," ");
		
		for (int i = 0; i < operator.length; i++) {
			operator[i] = Integer.parseInt(st.nextToken());
		}
		addOper(numbers[0], 1);
		
		System.out.println(maxVal);
		System.out.println(minVal);
	}
	
	public static void addOper(int num, int index) {
		if(index == N) {
			maxVal = Math.max(maxVal, num);
			minVal = Math.min(minVal, num);
			return;
		}
		
		for (int i = 0; i < 4; i++) {
			
			if(operator[i] > 0) {
				
				operator[i]--;
				
				switch(i) {
				
				case 0 : addOper(num + numbers[index], index+1); break;
				case 1 : addOper(num - numbers[index], index+1); break;
				case 2 : addOper(num * numbers[index], index+1); break;
				case 3 : addOper(num / numbers[index], index+1); break;
				
				}
				
				operator[i]++;
			}
		}
	}
	
}
