package data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BOJ1935 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String func = br.readLine();
		char[] arr = func.toCharArray();
		Stack<Double> stack = new Stack<>();
		Map<Character,Integer> hs = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			hs.put(arr[i],hs.getOrDefault(arr[i], 0));
		}
		for (int i = 0; i < arr.length; i++) {
			double a;
			double b;
			switch(arr[i]) {
				case '+' :
					a = stack.pop();
					b = stack.pop();
					stack.add(b+a);
					break;
				case '-' : 
					a = stack.pop();
					b = stack.pop();
					stack.add(b-a);
					break;
				case '*' : 
					a = stack.pop();
					b = stack.pop();
					stack.add(b*a);
					break;
				case '/' : 
					a = stack.pop();
					b = stack.pop();
					stack.add(b/a);
					break;
				default : 
					
					if(hs.get(arr[i]) == 0) {
						double temp = Double.parseDouble(br.readLine());
						stack.add(temp);
						hs.replace(arr[i], (int) temp);
					} else {
						stack.add((double)hs.get(arr[i]));
						
					}
					
					break;
			}					
		}
		System.out.printf("%.2f",stack.pop());
 	}

}
