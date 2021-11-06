package test;

public class five {
	static int[][] board = new int[3][4];
	
	public static void main(String[] args) {
		int rows = 3;
		int columns =4;
		go(1,0,0,rows,columns);
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		

	}
	
	static void go(int start,int r, int c,int rows,int columns) {
		board[r][c] = start;
		if(!check(board,rows,columns)) {
			if(start %2 != 0) {
				c++;
				if(c >=columns) {
					c=0;
				}
				go(start+1,r,c,rows,columns);
				
			}
			else {
				r++;
				if(r >=rows) {
					r=0;
				}
				go(start+1,r,c,rows,columns);
			}
	
		}
	}
	static boolean check(int[][] arr,int rows, int columns) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if(arr[i][j] == 0) {
					return false;
				}
			}
		}
		return true;
	}
}
