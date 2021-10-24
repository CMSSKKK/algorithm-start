# [프로그래머스] 주식가격 (스택&큐 Level 2)

```java
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                answer[i]++;
                if (prices[i] > prices[j]) 
                    break;

            }
        }

        return answer;
    }
}
```



```java
import java.util.*;

class Solution {
    public int[] solution(int[] prices) {

        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            while(!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                answer[stack.peek()] = i-stack.peek();
                stack.pop();
            }
            stack.push(i);
        }

        while(!stack.isEmpty()) {
            answer[stack.peek()] = prices.length - stack.peek()-1;
            stack.pop();
        }


        return answer;
    }
}
// 이중 반복문이 아닌 스택으로 풀이
// https://girawhale.tistory.com/7?category=915306
```

