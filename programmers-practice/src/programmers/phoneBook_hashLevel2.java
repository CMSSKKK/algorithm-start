package programmers;

import java.util.HashMap;

public class phoneBook_hashLevel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] phoneBook = {"119", "97674223", "1195524421"};
		boolean answer = true;
		
		HashMap<String,Integer> hm = new HashMap<>();
	        
	        for(int i= 0; i < phoneBook.length; i++) {
	            hm.put(phoneBook[i],i);
	        }
	        
	        for(int i = 0; i< phoneBook.length; i++) {
	    
	        	for(int j = 1; j < phoneBook[i].length(); j++) {
	        		
	        		// System.out.println(phoneBook[i].substring(0,j));
	            	if(hm.containsKey(phoneBook[i].substring(0,j))) {
	            		answer = false;	            		
	                }
	            }
	        }
	        System.out.println(answer);
	        
	}

}
