package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class Student {
	int x,y;
	int[] favFriends;
	
	Student(int x, int y ,int[] arr) {
		this.x = x;
		this.y = y;
		this.favFriends = arr;
	}
 }

public class BOJ21608 {
	
	static int N;
	static int[][] clazz;
	static Map<Integer,Student> map = new HashMap<>();
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		clazz = new int[N+1][N+1];
		
	
		
		StringTokenizer st;
	
		
//		for (int i = 1; i < N*N; i++) {
//			st = new StringTokenizer(br.readLine()," ");
//			list= new ArrayList<>();
//			int key = Integer.parseInt(st.nextToken());
//			
//			for(int j = 0; j < 4; j++) {
//				list.add(Integer.parseInt(st.nextToken()));
//			}
//			map.put(key, list);
//			
//			chooseSeat(key);
//		}
		
		
	}
	
	
	static void chooseSeat(int key, int[] farr) {
		int[][] nearf = new int[N][N];
		for (int friend : farr) {
			if(map.containsKey(friend)) {
				Student student = map.get(friend);
				int x = student.x;
				int y = student.y;
				
				for (int i = 0; i < 4; i++) {
					int nx = x+dx[i];
					int ny = y+dy[i];
					if(nx>=0 && nx <N && ny >=0 && ny < N && clazz[nx][ny] == 0) {
						nearf[nx][ny]++;
					}
				}
			}
		}
		
		int emptyMax = -1;
		int nearfMax = -1;
		int choiceX = -1;
		int choicey = -1;
		
	}
	
	static int satisfied(int seat) {
		return 0;
	}
}
