package beakjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 연습 {
    static boolean[] visited;

    static List<List<Integer>> graph;

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

        bfs(v);
    }

    static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start]=true; //방문

        while (!q.isEmpty()) {
            int cur = q.poll();

            System.out.print(cur + " ");

            for(Integer next : graph.get(cur)) {
                if(visited[next]==false) {//미방문
                    q.offer(next);
                    visited[next]=true;
                }
            }
        }
    }

    class Solution {
        public int solution(int num1, int num2) {
            int answer = (int) Math.floor((num1 / num2) * 1000);
            return answer;
        }
    }
}
