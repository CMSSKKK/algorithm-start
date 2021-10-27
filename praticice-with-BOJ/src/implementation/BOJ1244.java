package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1244 {
	
	static int[] switches;
	static int N;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		switches = new int[N];
		for (int i = 0; i < N; i++) {
			switches[i] = Integer.parseInt(st.nextToken());
		}
		
		int students = Integer.parseInt(br.readLine());
		
		while(students-- > 0) {
			st = new StringTokenizer(br.readLine());
			
			int sex = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			command(sex, num);
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			sb.append(switches[i]).append(" ");
			if((i+1)%20 == 0) sb.append('\n');
		}
		System.out.print(sb);
		
	}
	
	static void command(int sex, int number) {
		int index = number -1;
		if(sex == 1) {
			
			while(index < N ) {
				int temp = switches[index];
				if(temp == 0) {
					switches[index] = 1;
				} else {
					switches[index] = 0;
				}
				index += number;
			}
			
		}
		else {
			
			int next = 0;
			while(0<= index-next-1 && index+next+1 <N && switches[index-next-1]==switches[index+next+1]) {
				next++;
			}
			for (int i = index-next; i <= index+next; i++) {
				if(switches[i] == 0) {
					switches[i] = 1;
				} else {
					switches[i] = 0;
				}
			}	
			
		}
	}

}
