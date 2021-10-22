package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ17451ver2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		long[] arr = new long[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for (int i = 0; i < N; i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
		
		long val = arr[N-1];
		
		for (int i = N-2; i >=0; i--) {
			if(val%arr[i] != 0 ) {
				val = (val/arr[i]+1)*arr[i];
			}
			
		}
		
		System.out.println(val);

	}

}
