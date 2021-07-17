package baek_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek11720 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		int sum = 0;
		for (Byte value : br.readLine().getBytes()) {
			sum += (value -'0');
		}
			
		System.out.println(sum);
		
		
	}

}
