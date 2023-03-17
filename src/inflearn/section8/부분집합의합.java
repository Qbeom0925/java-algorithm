package inflearn.section8;

import java.util.*;
import java.io.*;

public class 부분집합의합 {

	static int N;
	static int[] arr;
	static String answer = "NO";
	static boolean flag = false;
	static int total = 0;


	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		arr= new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			total += arr[i];
		}

		DFS(0,0);

		System.out.println(answer);
	}

	private static void DFS(int L, int sum) {
		if(flag) return;
		if(sum > total) return;
		if(L==N) {
			if(total / 2 ==sum) {
				flag = true;
				answer = "YES";
			}
		}else {
			DFS(L+1, sum + arr[L]);
			DFS(L+1, sum);
		}
	}

}