package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ20436 {
	static String[] keyBoard = {"qwertyuiop","asdfghjkl","zxcvbnm"};
	static char[] text;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		char left = st.nextToken().charAt(0);
		char right =st.nextToken().charAt(0);
		
		text = br.readLine().toCharArray();
		int lx = 0;
		int ly = 0;
		int rx = 0;
		int ry = 0;
		
		for (int j = 0; j < 3; j++) {
			for (int k = 0; k < keyBoard[j].length(); k++) {
				if(left == keyBoard[j].charAt(k) ) {
					lx = j;
					ly = k;
					break;
				}
			}
		}
		
		for (int j = 0; j < 3; j++) {
			for (int k = 0; k < keyBoard[j].length(); k++) {
				if(right == keyBoard[j].charAt(k) ) {
					rx = j;
					ry = k;
					break;
				}
			}
		}
		int sum = 0;
		for (int i = 0; i < text.length; i++) {
			char temp = text[i];
			
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < keyBoard[j].length(); k++) {
					if(temp == keyBoard[j].charAt(k) ) {
						if((j<2 && k <5 ) || (j ==2 && k <4)) {
							int tx = Math.abs(lx - j);
							int ty = Math.abs(ly - k);
							lx = j;
							ly = k;
							sum += tx+ty+1;
						}
						else {
							int tx = Math.abs(rx - j);
							int ty = Math.abs(ry - k);
							rx = j;
							ry = k;
							sum += tx+ty+1;
						}
					}
				}
			}
		}
		System.out.println(sum);
	}


}
