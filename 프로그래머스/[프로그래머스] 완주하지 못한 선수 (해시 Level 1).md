# [프로그래머스] 완주하지 못한 선수 (해시 Level 1)

```java
import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String runner : participant) {
            map.put(runner, map.getOrDefault(runner, 0) + 1);
        }
        
        for(String runner : completion) {
            map.put(runner, map.get(runner) - 1);
        }
        
        for(String key : map.keySet()) {
            if(map.get(key) != 0){
                answer = key;
                break;
            }
        }
        return answer;
    }
}
```
> HashMap 에서 `keySet()`, `entrySet()`, `iterator()`,`values()`, `forEach()` 디테일과 사용법을 숙지가 필요하다.

