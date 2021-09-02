package BOJ_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1541 { // 핵심은 +계산을 먼저 다 처리한 이후에 -계산을 하게 되면 최솟값이 된다. 

	public static void main(String[] args) throws IOException{ 
		
		// StringTokenizer 사용 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer sub = new StringTokenizer(br.readLine(),"-");
		int sum =Integer.MAX_VALUE;
		
		while(sub.hasMoreTokens()) {
			
			int temp = 0;
			
			StringTokenizer add = new StringTokenizer(sub.nextToken(),"+");
			
			while(add.hasMoreTokens()) {
				temp += Integer.parseInt(add.nextToken());
			}
			
			if(sum == Integer.MAX_VALUE) {
				sum = temp;
			} else {
				sum -=temp;
			}
		}
		
		System.out.println(sum);
		
//		// split 사용 
//		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
//		int sum2 = Integer.MAX_VALUE;
//		String[] sub2 = br.readLine().split("-");
//		
//		for (int i = 0; i < sub2.length; i++) {
//			int temp = 0;
//			
//			String[] add2 = sub2[i].split("\\+"); // +는 메타문자라서 \\+가 필요하다. 
//			
//			for (int j = 0; j < add2.length; j++) {
//				temp += Integer.parseInt(add2[j]);
//			}
//			
//			if(sum2 == Integer.MAX_VALUE) {
//				sum2 = temp;
//			} else {
//				sum2 -= temp;
//			}
//		}
//		
//		System.out.println(sum2);
	}

}
