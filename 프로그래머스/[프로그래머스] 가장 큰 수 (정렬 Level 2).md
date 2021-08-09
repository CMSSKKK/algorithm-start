# [프로그래머스] 가장 큰 수 (정렬 Level 2)

```java
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] strNum = new String[numbers.length];
        
        for(int i = 0; i < numbers.length; i++) {
            strNum[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(strNum, new Comparator<String>() {
            
            public int compare(String o1, String o2) {
                
                return (o2+o1).compareTo(o1+o2);
            }
        });
        
        if(strNum[0].equals("0")) return "0";
		
        for(String num : strNum) {
            answer += num;
        }
        return answer;
    }
}
```

