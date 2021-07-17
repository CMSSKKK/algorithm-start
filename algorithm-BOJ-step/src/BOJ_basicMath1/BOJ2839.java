package BOJ_basicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2839 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N =Integer.parseInt(br.readLine());
		
		// 단순 계산 로직
		int count = 0;
		while(true) {
			if(N%5 == 0) {
				count += N/5;
				break;
			}
			N -=3;
			count++;
			
			if(N<0) {
				count = -1;
				break;
			}
		}		
		System.out.println(count);
		
		// 규칙 찾아서 풀이하는 알고리즘
//		if (N==4 || N==7) {
//			System.out.println(-1);
//		}
//		else if (N%5 ==0) {
//			System.out.println(N/5);
//		}
//		else if (N%5 ==1 || N%5 ==3) {
//			System.out.println((N/5) +1);
//		}
//		else if (N%5 ==2 || N%5 ==4) {
//			System.out.println((N/5) +2);
//		}
				
	}
}