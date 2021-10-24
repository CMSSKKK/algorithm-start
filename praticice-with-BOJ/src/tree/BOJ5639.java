package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5639 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Node root = new Node(Integer.parseInt(br.readLine()));
		
		while(true) {
			String data = br.readLine();
			if(data == null || data.equals("")) break;
			
			root.insert(Integer.parseInt(data));
		}
		
		postOrder(root);
		
	}
	
	static void postOrder(Node node) {
		if(node == null) {
			return;
		}
		
		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.data);
	}
	

}

class Node{
	int data;
	Node left, right;
	
	Node(int data) {
		this.data = data;
	}
	
	Node(int data, Node left, Node right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	void insert(int d) {
		if(d < this.data) {
			if(this.left == null)
				this.left = new Node(d);
			else
				this.left.insert(d);
		}
		else {
			if(this.right == null)
				this.right = new Node(d);
			else
				this.right.insert(d);
		}
	}
}
