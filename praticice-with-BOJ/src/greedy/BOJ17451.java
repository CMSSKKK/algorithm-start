package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ17451 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		double[] arr = new double[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for (int i = 0; i < N; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
		}
		
		double val = arr[N-1];
		
		for (int i = N-2; i >=0; i--) {
			val = Math.ceil(val/arr[i])*arr[i];
		}
		
		System.out.println((long)val);
	}

}
