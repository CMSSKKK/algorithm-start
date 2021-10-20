package example;

import java.util.Scanner;

public class PrintChars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		print(str);
		System.out.println();
		printReverse(str);

	}
	
	static void print(String str) {
		if(str.length() == 0) {
			return;
		}
		else {
			System.out.print(str.charAt(0));
			print(str.substring(1));
		}
	}
	
	static void printReverse(String str) {
		if(str.length()==0) {
			return;
		}
		else {
			printReverse(str.substring(1));
			System.out.print(str.charAt(0));
		}
	}
}
