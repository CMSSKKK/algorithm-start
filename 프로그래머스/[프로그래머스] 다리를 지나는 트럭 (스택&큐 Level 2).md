# [프로그래머스] 다리를 지나는 트럭 (스택&큐 Level 2)

```java
import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
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
        return answer;
    }
}
```
