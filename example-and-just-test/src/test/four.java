package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class four {

	public static void main(String[] args) {
		String s = "aaabbaaa";
		String s2 = "wowwow";
		Stack<Character> stack = new Stack<>();
		char[] arr = s2.toCharArray();
		ArrayList<Integer> count = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			
			if(stack.isEmpty()) {
				stack.add(arr[i]);
				
			}
			else if(stack.peek() == arr[i]) {
				stack.add(arr[i]);
			} 
			
			if(stack.peek() != arr[i]) {
				count.add(stack.size());
				stack.clear();
				stack.add(arr[i]);
			}
				
			
			if(i == arr.length-1) {
				count.add(stack.size());
			}
			
		
		
		
		}	
		
		if(arr[0] == arr[arr.length-1]) {
			int start = count.get(0);
			int last = count.get(count.size()-1);
			count.remove(0);
			count.remove(count.size()-1);
			count.add(start+last);
			
		}
		Collections.sort(count);
		int[] temp = new int[count.size()];
		for (int i = 0; i < count.size(); i++) {
			temp[i] = count.get(i);
		}
		
		for (int j = 0; j < temp.length; j++) {
			System.out.println(temp[j]);
		}
		
	}

}
