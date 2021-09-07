# [프로그래머스\] 위장 (해시 Level 2)



```java
import java.util.HashMap;
import java.util.Iterator;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> hm = new HashMap<>();
        for(int i = 0 ; i <clothes.length; i++) {
            hm.put(clothes[i][1],hm.getOrDefault(clothes[i][1], 0)+1);
        }

        Iterator<Integer> iter = hm.values().iterator();
        while(iter.hasNext()) {
            answer *= iter.next().intValue()+1;
        }      
        return answer-1;
    }
}
```