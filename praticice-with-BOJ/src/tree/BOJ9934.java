package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ9934 {
	
	static int[] arr;
	static StringBuilder[] sb;
	static int K;
	
 	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		K = Integer.parseInt(br.readLine());
		arr = new int[(int)Math.pow(2,K)-1];
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		sb = new StringBuilder[K];
		for (int i = 0; i < K; i++) {
			sb[i]= new StringBuilder();
		}
		search(0, arr.length-1, 0);
		
		for (int i = 0; i < K; i++) {
			System.out.println(sb[i]);
		}
		
	}
	
	static void search(int start, int end, int depth) {
		if(depth == K) {
			return;
		}
		
		int middle = (start+end)/2;
		sb[depth].append(arr[middle]).append(" ");
		
		search(start, middle-1,depth+1);
		search(middle+1, end, depth+1);
	}
}
