package beakjoon.graph;

import java.util.*;
import java.io.*;

public class B1260 {
    static boolean[] visited;

    static List<List<Integer>> graph;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        Math.floor(m);

        visited = new boolean[n+1];

        graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(graph.get(i));
        }

        dfs(v);
        sb.append('\n');
        visited = new boolean[n+1];
        bfs(v);

        System.out.println(sb);
    }

    static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start]=true; //방문

        while (!q.isEmpty()) {
            int cur = q.poll();

            sb.append(cur).append(' ');

            for(Integer next : graph.get(cur)) {
                if(visited[next]==false) {//미방문
                    q.offer(next);
                    visited[next]=true;
                }
            }
        }
    }

    static void dfs(int start) {
        sb.append(start).append(' ');
        visited[start]=true;
        for(int next : graph.get(start)) {
            if(!visited[next]) {
                dfs(next);
            }
        }
    }
}
