package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountContainNumber {
	
	
 	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int range = Integer.parseInt(br.readLine()); //32742
		int target = Integer.parseInt(br.readLine()); // 3
		int start = Integer.parseInt(br.readLine());
		System.out.println(countTarget(start, range, target));
	}
 	
 	static int countTarget(int start, int range, int target) {
 		int count = 0;
 		for (int i = start; i <= range; i++) {
			
 			String temp = i+"";
 			
 			for (int j = 0; j < temp.length(); j++) {
				if(Integer.valueOf(temp.charAt(j)-'0')==target) {
					count++;
				}
			}
		}
 		
 		return count;
 	}
}
