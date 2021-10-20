package example;

public class SequentialSearch {

	static int search(int[] data, int n, int target) {
		for (int i = 0; i <n; i++) {
			if(data[i]==target)
				return i;
		}
		return -1;
	}
	
	static int searchRecur(int[] data, int begin, int end, int target) {
		if(begin>end) {
			return -1;
		}
		else if(target == data[begin]) {
			return begin;
		}
		else {
			return searchRecur(data, begin+1, end, target);
		}
	}
	
	
	
	
}
