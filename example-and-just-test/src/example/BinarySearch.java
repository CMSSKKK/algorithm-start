package example;

public class BinarySearch {

	static int binarySearch(String[] items, String target, int begin, int end) {
		if(begin > end) {
			return -1;
		}
		
		else {
			int middle = (begin+end)/2;
			int compResult = target.compareTo(items[middle]);
			if(compResult == 0) {
				return middle;
			} 
			else if ( compResult < 0) {
				return binarySearch(items, target, begin, middle-1);
			}
			else {
				return binarySearch(items, target, middle+1, end);
			}
		}
	}
	
	public static void main(String[] args) {
		
		//compareToTest
		String str1 = "a";
		String str2= "b";
		String str3= "c";
		
		System.out.println(str2.compareTo(str1));
	}

}
