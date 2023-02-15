package inflearn.section7;

import java.util.*;
import java.io.*;

public class 경로탐색인접리스트 {

	static int n,m,answer = 0;
	static int[] visited;
	static ArrayList<ArrayList<Integer>> graph;
	
	public static void DFS(int v) {
		if(v==5) {
			answer++;
			visited[5]=0;
		}
		
		for(int nv : graph.get(v)) {
			if(visited[nv]==0) {
				visited[nv]=1;
				DFS(nv);
				visited[nv]=0;
			}
		}
		
		
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		visited = new int[n+1];
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph.get(a).add(b);
		}
		
		visited[1]=1;
		DFS(1);
		System.out.println(answer);

	}

}
