# [프로그래머스] 전화번호 목록 (해시 Level 2)

```java
import java.util.HashMap;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        HashMap<String,Integer> hm = new HashMap<>();
        
        for(int i= 0; i < phone_book.length; i++) {
            hm.put(phone_book[i],i);
        }
        
        for(int i = 0; i< phone_book.length; i++) {
            for(int j = 1; j < phone_book[i].length(); j++) {
                if(hm.containsKey(phone_book[i].substring(0,j))) {
                    answer = false;
                    return answer;
                }
            }
        }
        
        return answer;
    }
}
```

