package programmers;

import java.util.HashMap;
import java.util.Iterator;



public class SpyClothes {

	public static void main(String[] args) {
		HashMap<String,Integer > hm = new HashMap<>();
		String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
		int answer = 1;
		
		for (int i = 0; i < clothes.length; i++) {
			String key = clothes[i][1];
			hm.put(key, hm.getOrDefault(key, 0)+1);
		}
		
//		for (String key : hm.keySet()) {
//			System.out.println(hm.get(key));
//			System.out.println(key);
//		}
		
		Iterator<Integer> iter = hm.values().iterator();
		while(iter.hasNext()) {
			answer *= iter.next().intValue()+1;
		}
		
		System.out.println(answer-1);
	}

}
