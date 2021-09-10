package programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class functionImprove {

	public static void main(String[] args) {
		
		int[] progresses = {93,30,55};
		int[] speeds = {1,30,5};
		
		 Queue<Integer> queue = new LinkedList<>();
	     List<Integer> answerList = new ArrayList<>();

	     for (int i = 0; i < speeds.length; i++) {
	            double remain = (100 - progresses[i]) / (double) speeds[i];
	            int date = (int) Math.ceil(remain);

	            if (!queue.isEmpty() && queue.peek() < date) {
	                answerList.add(queue.size());
	                queue.clear();
	            }

	            queue.offer(date);  
	        }

	        answerList.add(queue.size());

	        int[] answer = new int[answerList.size()];

	        for (int i = 0; i < answer.length; i++) {
	            answer[i] = answerList.get(i);
	            System.out.println(answer[i]);
	        }

	        
	}
		
}


