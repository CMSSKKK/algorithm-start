package BOJ_numbertheory_and_combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

public class BOJ9375 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int result;
		
		for (int i = 0; i < T; i++) {
			int clothes = Integer.parseInt(br.readLine());
			
			result = 1;
			HashMap<String, Integer> hm = new HashMap<>();
			
			for (int j = 0; j < clothes; j++) {
				StringTokenizer st= new StringTokenizer(br.readLine()," ");
				st.nextToken();
				String temp = st.nextToken();
				hm.put(temp, hm.getOrDefault(temp, 0)+1);
			}
			
			Iterator<Integer> iter = hm.values().iterator();
			while(iter.hasNext()) {
				result *= iter.next().intValue()+1;
			}
			System.out.println(result-1);
		}
	}

}
