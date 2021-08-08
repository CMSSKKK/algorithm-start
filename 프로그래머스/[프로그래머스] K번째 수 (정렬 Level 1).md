# [프로그래머스] K번째 수 (정렬 Level 1)



```java
import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i< commands.length; i++) {
           int[] ans = Arrays.copyOfRange(array, commands[i][0] -1, commands[i][1]);
           // Arrays.copyOfRange([], from, to) 배열[]을 from부터 to까지 복사 (to는 포함하지 않음)  
           Arrays.sort(ans);
            answer[i] = ans[commands[i][2]-1];
        }
        return answer;
    }
}
```

