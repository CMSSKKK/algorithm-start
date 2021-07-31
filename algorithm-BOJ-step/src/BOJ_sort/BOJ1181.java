package BOJ_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ1181 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] str = new String[N];
		
		for (int i = 0; i < N; i++) {
			str[i]=br.readLine();			
		}
		br.close();
		
		Arrays.sort(str, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2); // 사전순으로 정렬
				}
				else {
					return o1.length() - o2.length();
				}
				
			}
		});

		StringBuilder sb = new StringBuilder();
		
		sb.append(str[0]).append('\n');
		
		for (int i = 1; i < N; i++) {
			if(!str[i].equals(str[i-1])) { // 중복 단어 찾기
				sb.append(str[i]).append('\n');
			}
			
		}
		System.out.println(sb);
	}

}
