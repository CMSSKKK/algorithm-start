package BOJ_basicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ3053 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double r = Double.parseDouble(br.readLine());
		
		System.out.println(r*r*Math.PI);
		System.out.println(r*r*2);
		
	}

}
