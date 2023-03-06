package inflearn.section7;

import java.util.*;
import java.io.*;

public class 그래프최단거리BFS {

	static int N;
	static int M;
	static boolean[] visited;
	static ArrayList<ArrayList<Integer>> list;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		list = new ArrayList<ArrayList<Integer>>();
		visited = new boolean[N+1];
		
		for(int i = 0; i <= N; i++) {	
			list.add(new ArrayList<>());
		}
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			list.get(a).add(b);
		}
		
		for(int i = 2; i <= N; i++) {
			System.out.println(i + " : "+BFS(i));
			visited = new boolean[N+1];
		}
		
		
	}
	
	public static int BFS(int E) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(1);
		int level = 0;
		visited[1]=true;
		
		while(!q.isEmpty()) {
			int len = q.size();
			for(int i = 0; i < len; i++) {
				int cur = q.poll();
				for(int j = 0; j < list.get(cur).size(); j++) {
					int nx = list.get(cur).get(j);
					if(nx == E) return ++level;
					if(!visited[nx]) {
						visited[nx]=true;
						q.offer(nx);
					}
				}
			}
			level++;
		}
		return level;
	}
}
