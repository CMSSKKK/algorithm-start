```java
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] people = new int[n];
        int answer = n;

        for (int l : lost) 
            people[l-1]--;
        for (int r : reserve) 
            people[r-1]++;

        for (int i = 0; i < people.length; i++) {
            if(people[i] == -1) {
                if(i-1>=0 && people[i-1] == 1) {
                    people[i]++;
                    people[i-1]--;
                }else if(i+1< people.length && people[i+1] == 1) {
                    people[i]++;
                    people[i+1]--;
                }else 
                    answer--;
            }
        }
        return answer;
    }
} // https://programmers.co.kr/learn/courses/30/lessons/42862/solution_groups?language=java
```

> 나는 단순하게 이중 for문으로 문제를 해결했으나,
>
>  위의 풀이법을 보고는 알고리즘 풀이전에 '또 다른 방향은 없을까?' 하는 고민의 시간을 더 많이 갖자는 생각을 했다.

