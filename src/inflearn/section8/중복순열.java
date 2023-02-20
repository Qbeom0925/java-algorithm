package inflearn.section8;

import java.util.*;
import java.io.*;

public class 중복순열 {

	static int N,M;
	static int[] arr;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[M];
		
		DFS(0);
		
	}

	private static void DFS(int L) {
		if(L==M) {
			for(int x : arr) {
				System.out.print(x + " ");
			}
			System.out.println();
		}else {
			for(int i = 1; i <= N; i++) {
				arr[L]=i;
				DFS(L+1);
			}
		}
	}

}
