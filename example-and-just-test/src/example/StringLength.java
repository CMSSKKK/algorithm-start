package example;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(length(str));
		
	}
	static int length(String str) {
		if(str.equals(""))
			return 0;
		else
			return 1+length(str.substring(1));
	}
}
