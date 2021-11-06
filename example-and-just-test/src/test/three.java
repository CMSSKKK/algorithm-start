package test;

import java.util.HashMap;
import java.util.StringTokenizer;

public class three {

	public static void main(String[] args) {
		String[] ings = {"r 10", "a 23", "t 124", "k 9"};
		String[] menu = {"PIZZA arraak 145", "HAMBURGER tkar 180", "BREAD kkk 30", "ICECREAM rar 50", "SHAVEDICE rar 45", "JUICE rra 55", "WATER a 20"};
		String[] sell = {"BREAD 5", "ICECREAM 100", "PIZZA 7", "JUICE 10", "WATER 1"};
		StringTokenizer st;
		HashMap<String,Integer> material = new HashMap<>();
		for (int i = 0; i < ings.length; i++) {
			st = new StringTokenizer(ings[i]);
			material.put(st.nextToken(), Integer.parseInt(st.nextToken()));
		}
		HashMap<String,String[]> food = new HashMap<>();
		for (int i = 0; i < menu.length; i++) {
			st = new StringTokenizer(menu[i]," ");
			String key = st.nextToken();
			String[] temp = new String[2];
			temp[0]=st.nextToken();
			temp[1]=st.nextToken();
			food.put(key, temp);
		}
		
		HashMap<String,Integer> quantity = new HashMap<>();
		for (int i = 0; i < sell.length; i++) {
			st = new StringTokenizer(sell[i]);
			quantity.put(st.nextToken(), Integer.parseInt(st.nextToken()));
		}
		int price = 0;
		int cost = 0;
		
		for (String key : quantity.keySet()) { // 판매한 메뉴 찾기 
			
			for (String f : food.keySet()) { // 메뉴의 재료와 판매값 찾기 
				int fee = 0;
				if(key.equals(f)) {
					String[] t = food.get(f);
					price += Integer.parseInt(t[1])*quantity.get(key);
					
					for (int i = 0; i < t[0].length(); i++) { // 재료비 구하기 
						char ing = t[0].charAt(i);
						
						for (String m : material.keySet()) {
							
							if(ing == m.charAt(0)) {
								fee+= material.get(m);
							}
						}
						
					}
					
				}
				cost += fee*quantity.get(key);
				
			}
		}
		
		System.out.println(price-cost);

	}

}
