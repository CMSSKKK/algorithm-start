package baek_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class baek4344 { 
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		   
		int C = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < C; i++) {
			st= new StringTokenizer(br.readLine()," ");;
			int stuNumber =Integer.parseInt(st.nextToken());
			int score[] =new int[stuNumber];
			double sum = 0;
			
			for (int j = 0; j < score.length; j++) {
				score[j] =Integer.parseInt(st.nextToken());
				sum+=score[j];
			}
			
			double average = sum/stuNumber;
			double highStudent = 0;			
			
			for (int k = 0; k < score.length; k++) {
				if(score[k]>average) {
					highStudent++;
				}
			}
			
			System.out.printf("%.3f%%\n",highStudent/stuNumber*100);
		}																															
		
		
		
	}
}