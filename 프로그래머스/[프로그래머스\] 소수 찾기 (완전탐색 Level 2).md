# [프로그래머스\] 소수 찾기 (완전탐색 Level 2)



```java
import java.util.HashSet;
import java.util.Set;

public class findPrimeNumber {
	// 재귀로 숫자 조합 완성하는 로직을 짜야한다. 
	
	static boolean visit[]; // 방문한 노드인지 체크하기 
	static Set<Integer> set = new HashSet<>(); // 결과 저장(중복되는 값이 생길 수 있기 때문에 set에 저장) 
	static char[] arr;
	
 	public static void main(String[] args) {
		String number = "17"; // 1 7 17 71
		String number2 = "011"; 
		visit = new boolean[number.length()];
		arr = new char[number.length()];
		
		for (int i = 1; i <= number.length(); i++) {
			dfs(0,i,number);
		}
		
		System.out.println(set.size());
		
		
		
		
	}
	
	static void dfs(int level, int length, String numbers) {
		if(level == length) {
			int temp = charsToInt(arr,length);
			if(isPrime(temp)) {
				set.add(temp);
			}
		} else {
			for (int i = 0; i < numbers.length(); i++) {
				if(!visit[i]) {
					visit[i] = true;
					arr[level] = numbers.charAt(i);
					dfs(level+1,length,numbers);
					visit[i] = false;
				}
			}
		}
 	}
	
	static int charsToInt(char[] arr, int length) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < length; i++) {
			sb.append(arr[i]);
		}
		return Integer.parseInt(sb.toString());
	}
	
	static boolean isPrime(int n) {
	    if( n <= 1 )
	        return false; 
	         
		
	    if( n%2 == 0) 
	        return n==2 ? true : false;
	         
		
	    for(int i=3; i<=Math.sqrt(n); i += 2) { 
			
	        if( n % i == 0)
	            return false;
	    }
	    
		return true; 
	}
}

```

```java
import java.util.HashSet;
class Solution {
    public int solution(String numbers) {
        HashSet<Integer> set = new HashSet<>();
        permutation("", numbers, set);
        int count = 0;
        while(set.iterator().hasNext()){
            int a = set.iterator().next();
            set.remove(a);
            if(a==2) count++;
            if(a%2!=0 && isPrime(a)){
                count++;
            }
        }        
        return count;
    }

    public boolean isPrime(int n){
        if(n==0 || n==1) return false;
        for(int i=3; i<=(int)Math.sqrt(n); i+=2){
            if(n%i==0) return false;
        }
        return true;
    }

        public void permutation(String prefix, String str, HashSet<Integer> set) {
        int n = str.length();
        //if (n == 0) System.out.println(prefix);
        if(!prefix.equals("")) set.add(Integer.valueOf(prefix));
        for (int i = 0; i < n; i++)
          permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), set);

    }

} // https://programmers.co.kr/learn/courses/30/lessons/42839/solution_groups?language=java
```

