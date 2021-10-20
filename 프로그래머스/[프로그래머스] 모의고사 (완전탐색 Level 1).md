# [프로그래머스] 모의고사 (완전탐색 Level 1)



```java
import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer;
        
        int[] supo1 = {1,2,3,4,5};
        int[] supo2 = {2,1,2,3,2,4,2,5};
        int[] supo3 = {3,3,1,1,2,2,4,4,5,5};
        
        Map<Integer,Integer> score = new HashMap<>();
        
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == supo1[i%5]) score.put(1,score.getOrDefault(1, 0) + 1);
            if(answers[i] == supo2[i%8]) score.put(2,score.getOrDefault(2, 0) + 1);
            if(answers[i] == supo3[i%10]) score.put(3,score.getOrDefault(3, 0) + 1);            
        }
        
        int max = -1;
        for(int key : score.keySet()){
            if(max < score.get(key)) 
                max = score.get(key);
        }
        
        int cnt = 0;
        
        for(int key : score.keySet()){
            if(max == score.get(key)) 
              cnt++;
        }
        
        answer = new int[cnt];
        
        int index = 0;
        for(int key : score.keySet()){
            if(max == score.get(key)){
                answer[index] = key;
                index++;
            }
        }
      
        
        return answer;
    }
}
```

