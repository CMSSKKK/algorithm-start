package BOJ_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;



public class BOJ18870 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] coordinates = new int[N];
		StringTokenizer st= new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		int count =0;
		
		for (int i = 0; i < N; i++) {
			coordinates[i] = Integer.parseInt(st.nextToken());			
		}
		int[] index = coordinates.clone();
		
		Arrays.sort(coordinates);
		
		
		HashMap<Integer, Integer> hmap = new HashMap();
		
		for (int i = 0; i < coordinates.length; i++) {
			if(!hmap.containsKey(coordinates[i])) {
				hmap.put(coordinates[i],count++);
			}
			
		}
		for (int i = 0; i < N; i++) {
			sb.append(hmap.get(index[i])).append(" ");		
		}
		
		System.out.println(sb);
	}

}
