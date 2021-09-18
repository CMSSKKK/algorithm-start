# [프로그래머스] 프린터 (스택/큐 Level 2)

```java
import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        LinkedList<int[]> queue = new LinkedList<>();
        for(int i = 0; i < priorities.length; i++) {
            queue.add(new int[] {i, priorities[i]});
        }

        while(!queue.isEmpty()) {
            int[] front = queue.poll();
            boolean isMax = true;

            for(int i = 0; i <queue.size(); i++) {

                if(front[1] <queue.get(i)[1]) {
                    queue.offer(front);

                    for(int j = 0; j<i; j++) {
                        queue.offer(queue.poll());
                    }

                    isMax = false;
                    break;
                }
            }

            if(isMax == false) {
                continue;
            }

            answer++;
            if(front[0] == location) {
                break;
            }

        }
        return answer;
    }
}
```

