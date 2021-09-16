package BOJ_queue_and_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ5430 {

	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(br.readLine()," ");

		String test  = "[1,2,3,4]";
		String sub = test.substring(1, test.length()-1);
		
		String[] temp =sub.split(",");
			for (String string : temp) {
				System.out.println(string);
			}
	}

}
