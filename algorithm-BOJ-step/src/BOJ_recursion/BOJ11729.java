package BOJ_recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11729 {
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int N = Integer.parseInt(br.readLine());
	
	sb.append((int)(Math.pow(2, N)-1)).append('\n'); 
	
	Hanoi(N,1,2,3);
	
	System.out.println(sb);
	}
	
	/*
	N : 원판의 개수 
	start : 출발지 
	mid : 옮기기 위해 이동해야 장소 
	to : 목적지
    */
	public static void Hanoi(int n, int start, int mid, int to) {
		if (n == 1) {
			sb.append(start+" "+to+"\n");
			return;
		}
		// N-1개를 A에서 B로 이동
		Hanoi(n-1,start,to,mid);
		// 1개를 A에서 C로 이동
		sb.append(start+" "+to+"\n");
		// N-1개를 B에서 C로 이동
		Hanoi(n-1,mid,start,to);
	}

}
