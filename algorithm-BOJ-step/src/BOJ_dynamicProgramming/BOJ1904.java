package BOJ_dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1904 {
	
	public static int[] dp = new int[10001];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		
		for(int i = 3; i<dp.length; i++)
			dp[i] = -1;
		
		System.out.println(tile(N));
	}
	
	public static int tile(int N) {
		
		if(dp[N] == -1) {
			dp[N] = (tile(N-1) + tile(N-2)) % 15746;
		}
		
		return dp[N];
		
	}
	
//	public static int Tile(int a) {
//		 
//		if (a == 1) {
//			return 1;
//		} 
// 
//		if (a == 2) {
//			return 2;
//		}
// 
//		// 초기 값 
//		int val1 = 1;
//		int val2 = 2;
//		int sum = 0;
// 
//		for (int i = 2; i < a; i++) {
//			sum = (val2 + val1) % 15746;	// 이전 값과 이전의 이전 값의 합 
//			val1 = val2;	// 이전의 이전 값은 이전 값으로 변경 
//			val2 = sum;		// 이전 값은 현재 합 값으로 변경 
//		}
// 
//		return sum;
// 
//	}
//	https://st-lab.tistory.com/125?category=868019
}	
//	일반적으로 이클립스에서 JVM 실행 옵션에서 메모리 사이즈를 잡아놓고 있습니다.
//	보통은 스택사이즈의 경우 최대 1024KB가 기본값으로 설정되어있습니다.
//	(https://www.eclipse.org/openj9/docs/openj9_defaults/)
//
//	그렇다보니 이클립스에서 큰 재귀의 경우 1024KB는 금방 넘어버리기 때문에 스택 메모리 사이즈를 늘려주어야 합니다.
//
//	두 가지 해결 방법이 있는데,
//	첫 번째는 해당 소스파일을 연 채로 run->run configurations에 들어가면 Arguments 탭이 있을 겁니다.
//	그 것을 클릭하면 두 개의 박스가 있을텐데, 그 중 VM arguments 박스가 있을 겁니다.
//
//	VM arguments: 박스 안에 -Xss<size> 옵션을 적어주시면 됩니다.
//	보통은 -Xss256m 정도면 충분하게 쓸겁니다. (256MB를 의미합니다.)
//
//	그리고 실행하면 큰 재귀에도 충분히 테스트해볼 수 있을겁니다.
	
//	두 번째 방법은 같은 라이브러리를 공유하는 모든 파일에 대한 설정 방법인데,
//	환경설정에서 목록 중 java -> installed JREs 에서 현재 라이브러리를 클릭한 후 Edit(수정)을 눌러 Default VM arguments 안에 -Xss<원하는 사이즈> 인자를 넣어주면 됩니다.
//
//	두 방법 모두 주의해야 할 것은 본인의 램 메모리 양을 감안하셔서 사이즈를 선택하는것이 좋습니다. 너무 크면 다른 프로세스가 실행을 못하니 자신의 현재 메모리를 감안하여 적절한 값을 선택하시길 바랍니다.
//
//	참고로 8GB 메모리에서 -Xss128m 만으로도 충분히 많은 양입니다.
	
//	https://st-lab.tistory.com/125?category=868019


