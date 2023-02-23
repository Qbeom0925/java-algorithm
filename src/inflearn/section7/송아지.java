package inflearn.section7;

import java.io.*;
import java.util.*;

public class 송아지 {

	static boolean[] visited;
	static int answer;
	static int[] move = {1, -1, 5};
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int S = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());
		
		System.out.println(BFS(S,E));
	}
	
	static int BFS(int S, int E) {
		Queue<Integer> q = new LinkedList<>();
		visited = new boolean[10001];
		visited[S]=true;
		q.offer(S);
		int step=0;
		
		while(!q.isEmpty()) {
			int len = q.size();
			for(int i = 0; i<len; i++) {
				int cur = q.poll();
				if(cur == E) return step;
				for(int j=0; j<3; j++) {
					int next = cur + move[j];
					if(next >= 1 && next <= 10000 && !visited[next]) {
						visited[next]= true;
						q.offer(next);
					}
				}
			}
			step++;
		}
		
		return step;
		
	}

}
