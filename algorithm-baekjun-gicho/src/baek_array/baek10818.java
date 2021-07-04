package baek_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class baek10818 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int N = Integer.parseInt(br.readLine());
		int input[] = new int[N];
		StringTokenizer st= new StringTokenizer(br.readLine()," ");;
		StringBuilder sb = new StringBuilder();
		int max = -1000000;
		int min= 1000000;
		for (int i = 0; i < N; i++) {			
			input[i] =Integer.parseInt(st.nextToken());					
			if (input[i] < min)
				min = input[i];
			if (input[i] >max )
				max = input[i];
		}		
		sb.append(min+" "+max);																											
		System.out.println(sb);
		
		
	}
}
