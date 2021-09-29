package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class BridgeTruck {

	public static void main(String[] args) {
		int weight =10;
		int bridge_length = 2;
		int[] truck_weights = {7,4,5,6};
		
 		int answer = 0;
        int sum = 0;
        int time = 0; 
        Queue<Integer> queue = new LinkedList<>();
    
        for(int i = 0; i< truck_weights.length; i++) {
            int truck = truck_weights[i];

            while(true) {

                if(queue.isEmpty()) {
                    queue.add(truck);
                    sum += truck;
                    time++;
                    break;
                } else if(queue.size() == bridge_length) {
                    sum -= queue.poll();
                } else {
                    if(sum +truck <= weight) {
                        queue.add(truck);
                        sum += truck;
                        time++;
                        break;
                    } else {

                        queue.add(0);
                        time++;
                    }
                }

            }
        }

        answer = time+bridge_length;
        System.out.println(answer);
                
	}

}
