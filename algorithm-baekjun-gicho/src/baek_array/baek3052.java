package baek_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class baek3052 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 							
		
		 boolean[] remainder = new boolean[42];	//42�� ������ ������ �⺻������ �������� 0~41�� ����        
	        
	        for(int i = 0 ; i < 10 ; i++) {
	            remainder[Integer.parseInt(br.readLine()) % 42] = true;
	        }
	        
	        int count = 0;
	        for(boolean value : remainder) {
	            if(value){    
	                count++;
	            }
	        }
	        System.out.println(count);
	        
//	        HashSet<Integer> remainder = new HashSet<Integer>();
//	        
//			
//			for (int i = 0; i < 10; i++) {
//				remainder.add(Integer.parseInt(br.readLine()) % 42);
//			}
//			
//			System.out.print(remainder.size());	
	        
//	        HashSet�� �ڹ� Collection �� Set�� �Ļ�Ŭ�����̴�.	        
//	        set�� �����̶�� �����ϸ� �Ǵµ�, HashSet �� ��� �� ���� Ư¡�� �ִ�.	         
//	        �ߺ��Ǵ� ���Ҹ� ���� ��� �ϳ��� �����Ѵ�. ��, �ߺ����Ҹ� ������� �ʴ´�.
//	        HashSet�� ���� ������ ����. 
//	        ���� Collections.sort() �޼ҵ带 ����� �� ����. ���� ������ �ϰ� �ʹٸ� ����Ʈ�� ��ȯ �� �����ؾ��Ѵ�.
//	        ��ó: Stranger's LAB
	}
}
