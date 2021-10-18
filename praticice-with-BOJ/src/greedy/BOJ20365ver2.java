package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ20365ver2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		StringTokenizer stB = new StringTokenizer(str,"R");
		StringTokenizer stR = new StringTokenizer(str,"B");
		int b = stB.countTokens();
		int r = stR.countTokens();
		System.out.println(Math.min(r, b)+1);
	}

}
