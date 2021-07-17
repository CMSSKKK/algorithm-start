package baek_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class baek2577 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 							
		int multiplied =Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());
		int arr[] = new int[10];	
		
		while(multiplied!=0) {
			arr[multiplied%10]++;
			multiplied/=10;
		}
		
		for(int result : arr) {
			System.out.println(result);
		}
		

 
//		String value = String.valueOf(multiplied);
// 
//		for (int i = 0; i < multiplied.length(); i++) {
//			arr[(multiplied.charAt(i) - 48)]++;
//		}
// 
//		for (int result : arr) {
//			System.out.println(result);
//		}
		
//		문자 문자코드
//
//		... ...
//
//		‘0’ 48
//
//		‘1’ 49
//
//		‘2’ 50
//
//		‘3’ 51
//
//		... ...



		
		
	}
}
