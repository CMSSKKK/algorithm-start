package example;

public class PowerSet {

	static char data[] = {'a','b','c','d','e'};
	static int n =data.length;
	static boolean[] include = new boolean[n];
	static int count = 0;
	public static void main(String[] args) {
		powerSet(0);
		System.out.println(count);
	}
	
	public static void powerSet(int k) {
		if(k == n ) {
			count++;
			for (int i = 0; i < n; i++) {
				if(include[i]) {
					System.out.print(data[i]+" ");
				}
			}
			System.out.println();
			return;
		}
		include[k] = false;
		powerSet(k+1);
		include[k]= true;
		powerSet(k+1);
	}

}
