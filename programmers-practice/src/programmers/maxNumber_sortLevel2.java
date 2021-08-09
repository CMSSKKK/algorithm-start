package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class maxNumber_sortLevel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer = "";
		int[] numbers = {6,10,2};
		
		String[] str = new String[numbers.length];
		
		for (int i = 0; i < numbers.length; i++) {
			str[i] = String.valueOf(numbers[i]);
		}
		Arrays.sort(str, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return (o2+o1).compareTo(o1+o2);
			}
			
		});
		if(str[0].equals("0")) System.out.println("0");
		
		for (String string : str) {
			answer += string;
		}
		System.out.println(answer);
	}

}
