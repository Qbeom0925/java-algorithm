package inflearn.section8;

import java.io.*;
import java.util.*;

public class 최대점수 {

	static int N, M;
	static int[] score;
	static int[] times;
	static int answer = Integer.MIN_VALUE;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		score = new int[N];
		times = new int[N];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			score[i] = Integer.parseInt(st.nextToken());
			times[i] = Integer.parseInt(st.nextToken());
		}
		
		DFS(0,0,0);
		System.out.println(answer);
		
	}

	private static void DFS(int L, int sum, int time) {
		if(time > M) return;
		if(L == N) {
			answer = Math.max(answer,sum);
		}else {
			DFS(L+1, sum + score[L], time + times[L]);
			DFS(L+1, sum, time);
		}
	}

}
