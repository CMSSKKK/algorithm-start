package baek_if;

import java.util.Scanner;

public class baek2884 {
		
//	������ �־����� ��, �����̸� 1, �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//	������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.
//
//	���� ���, 2012���� 4�� ����̸鼭 100�� ����� �ƴ϶� �����̴�. 1900���� 100�� ����̰� 400�� ����� �ƴϱ� ������ ������ �ƴϴ�. ������, 2000���� 400�� ����̱� ������ �����̴�.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
		int a = sc.nextInt();					
		if((a%4 == 0 && a%100 !=0) || (a % 400 ==0) )
			System.out.println("1");		
		else 
			System.out.println("0");
		
	}
	
}
