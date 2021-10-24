package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BOJ5639ver2 {
	
	static int[] tree = new int[10001];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int index = 0;
		while(true) {
			String data = br.readLine();
			if(data == null || data.equals("")) break;
			
			tree[index++] = Integer.parseInt(data);
		}
		
		postOrder(0, index-1);
		
	}
	
	static void postOrder(int n, int end) {
		if(n > end ) {
			return; 
		}
		
		int mid = n+1;
		while(mid <= end && tree[mid]< tree[n]) {
			mid++;
		}
		
		postOrder(n+1, mid-1);
		postOrder(mid, end);
		System.out.println(tree[n]);
	}
}
