package baek_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class baek1546 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int N = Integer.parseInt(br.readLine());
		int input[] = new int[N];
		StringTokenizer st= new StringTokenizer(br.readLine()," ");;		
		int max = 0;
		double sum = 0.0;
		for (int i = 0; i < N; i++) {			
			input[i] =Integer.parseInt(st.nextToken());								
			if (input[i] > max ) {
				max = input[i];
			}
				sum+=input[i];
			
		}
		
																													
		System.out.println(((sum/max)*100)/N);
		
//		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//				
//	        double arr[] = new double[Integer.parseInt(br.readLine())];
//	        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//	        for(int i = 0; i < arr.length; i++) {
//	            arr[i] = Double.parseDouble(st.nextToken());
//	        }
//	        double sum = 0;
//	        Arrays.sort(arr); 
//
//	        for(int i = 0; i < arr.length; i++) {
//	            sum += (arr[i] / arr[arr.length - 1] * 100);
//	        }
//
//	        System.out.println(sum / arr.length);
	}
}
