package example;

public class ToCharArrayTest {

	public static void main(String[] args) {
		String str = "abcd";
		int answer = 0;
		answer  = str.length();
		char[] arr = str.toCharArray();
 		System.out.println(answer);
		String ans = "";
		ans += arr[1];
		System.out.println(ans);
	}

}
