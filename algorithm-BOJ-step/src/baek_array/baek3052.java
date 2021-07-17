package baek_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class baek3052 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 							
		
		 boolean[] remainder = new boolean[42];	//42로 나누기 때문에 기본적으로 나머지는 0~41만 가능        
	        
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
	        
//	        HashSet은 자바 Collection 중 Set의 파생클래스이다.	        
//	        set을 집합이라고 생각하면 되는데, HashSet 의 경우 몇 가지 특징이 있다.	         
//	        중복되는 원소를 넣을 경우 하나만 저장한다. 즉, 중복원소를 허용하지 않는다.
//	        HashSet은 순서 개념이 없다. 
//	        따라서 Collections.sort() 메소드를 사용할 수 없다. 만약 정렬을 하고 싶다면 리스트로 변환 후 정렬해야한다.
//	        출처: Stranger's LAB
	}
}
