package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1991 {
	
	static int[][] tree = new int[26][2];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			char[] data = input.replaceAll(" ", "").toCharArray(); 
			
			tree[data[0]-'A'][0] = data[1]-'A';
			tree[data[0]-'A'][1] = data[2]-'A';
		}
		
		preOrder(0);
		System.out.println();
		inOrder(0);
		System.out.println();
		postOrder(0);
	}
	
	static void preOrder(int node) {
		char data = (char)(node+'A');
		System.out.print(data);
		if(tree[node][0]>=0) {
			preOrder(tree[node][0]);
		}
		if(tree[node][1]>=0) {
			preOrder(tree[node][1]);
		}
	}
	
	static void inOrder(int node) {
		
		if(tree[node][0]>=0) {
			inOrder(tree[node][0]);
		}
		char data = (char)(node+'A');
		System.out.print(data);
		if(tree[node][1]>=0) {
			inOrder(tree[node][1]);
		}
	}
	
	static void postOrder(int node) {
		if(tree[node][0]>=0) {
			postOrder(tree[node][0]);
		}
		if(tree[node][1]>=0) {
			postOrder(tree[node][1]);
		}
		char data = (char)(node+'A');
		System.out.print(data);
	}

}
