package baek_if;

import java.util.Scanner;

public class baek14681 {
//	���� ���� ���� �� �ϳ��� �־��� ���� ��� ��и鿡 ���ϴ��� �˾Ƴ��� ���̴�. ��и��� �Ʒ� �׸�ó�� 1���� 4���� ��ȣ�� ���´�. "Quadrant n"�� "��n��и�"�̶�� ���̴�.
//
//	���� ���, ��ǥ�� (12, 5)�� �� A�� x��ǥ�� y��ǥ�� ��� ����̹Ƿ� ��1��и鿡 ���Ѵ�. �� B�� x��ǥ�� �����̰� y��ǥ�� ����̹Ƿ� ��2��и鿡 ���Ѵ�.
//
//	���� ��ǥ�� �Է¹޾� �� ���� ��� ��и鿡 ���ϴ��� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. ��, x��ǥ�� y��ǥ�� ��� ����� ������� �����Ѵ�.
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
		int x = sc.nextInt();			
		int y = sc.nextInt();
		
		if(x>0 && x!=0)
			if(y>0)
				System.out.println("1");
				else
				System.out.println("4");
		else if(x<0 && x!=0)
			if(y>0)
				System.out.println("2");
				else
				System.out.println("3");
		
	}
	
}
