package inflearn.section8;

import java.util.*;
import java.io.*;

public class 바둑이승차 {
	
	static int answer = Integer.MIN_VALUE;
	static int[] weight;
	static int C, N;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		C = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		weight = new int[N];
		for(int i = 0; i < N; i++) {
			weight[i] = Integer.parseInt(br.readLine());
		}
		DFS(0,0);
		System.out.println(answer);
	}
	
	public static void DFS(int L, int sum) {
		if(sum > C) return;
		if(L == N) {
			answer = Math.max(sum,answer);
		}else {
			DFS(L+1, sum + weight[L]);
			DFS(L+1, sum);
		}
	}

}
