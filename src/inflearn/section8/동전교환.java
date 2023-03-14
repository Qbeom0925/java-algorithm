package inflearn.section8;

import java.util.*;
import java.io.*;

public class 동전교환 {

	static int N, M;
	static Integer[] coinse;
	static int answer = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		coinse = new Integer[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			coinse[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(coinse, Collections.reverseOrder());
		M = Integer.parseInt(br.readLine());
		
		DFS(0,0);
		System.out.println(answer);
	}

	private static void DFS(int L, int sum) {
		if(sum > M) return;
		if(L >= answer) return;
		if(sum == M){
			answer = L;
		}else{
			for (int i = 0; i < N; i++){
				DFS(L+1, sum+coinse[i]);
			}
		}
	}

}
