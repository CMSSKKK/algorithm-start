package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BOJ12933 {
	static char[] quack = {'q','u','a','c','k'};
	static boolean[] check;
	static char[] input;
	static int[] count;
 	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		input = br.readLine().toCharArray();
		int N = input.length;
		check = new boolean[N];
		count = new int[N];
		boolean possible = true;
		for (int i = 0; i < N; i++) {
			char temp = input[i];
			if(temp != 'q') {
				continue;
			}
			int target = i;
			int index = 0;
			while(index <5 && target < N) {
				if(check[target] == false && input[target] == quack[index] ) {
					check[target] = true;
					index++;
				}
				target++;
			}
			if(index != 5) possible = false;
			for (int j = i; j < target ; j++) {
				count[j]++;
			}
			
		}

		int duck = 0;
		for (int i = 0; i < N; i++) {
			if(count[i] == 0) possible = false;
			duck = Math.max(duck, count[i]);
		}
		
		if(possible) 
			System.out.println(duck);
		else
			System.out.println(-1);
	}
 	
 	
 }


