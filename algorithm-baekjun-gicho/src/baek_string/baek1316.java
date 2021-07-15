package baek_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class baek1316 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
				
		int T= Integer.parseInt(br.readLine());
		int count=0;
		
		for (int i = 0; i < T; i++) {
			if(check()) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static boolean check() throws IOException {
		boolean[] chkarr = new boolean[26];
		int pre = 0;
		String s = br.readLine();
		
		for(int i = 0; i < s.length(); i++) {
			int now = s.charAt(i);
			
			
			if (pre != now) {		
				if (!chkarr[now - 'a']) {
					chkarr[now - 'a'] = true;
					pre = now;	
				}
				else {
					return false;	
				}
			}
		}    
		return true;
	}
}
		
