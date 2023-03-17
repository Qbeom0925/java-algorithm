package inflearn.section8;

import java.util.*;
import java.io.*;

public class 조합구하기 {
	
	static int[] combi;
	static int N,M;

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		combi = new int[M];

		
		DFS(0,1);
		
	}

	private static void DFS(int L, int S) {
		if(L == M) {
			for(int x : combi) {
				System.out.print(x + " ");
			}
			System.out.println();
		}else {
			for(int i = S; i <= N; i++) {
				combi[L] = i;
				DFS(L+1, i+1);
			}
		}
		
	}

}
