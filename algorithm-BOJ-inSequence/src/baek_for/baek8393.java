package baek_for;

import java.util.Scanner;

public class baek8393 {
	// n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
		int N = sc.nextInt();			
		int sum = 0;
		for (int i = 1; i < N+1; i++) {
			sum +=i;				
		}
		System.out.println(sum);
		
	}
}
