package beakjoon.graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B2606 {
    static int n, k;
    static ArrayList<ArrayList<Integer>> graph;
    static int answer;
    static boolean[] visited;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());
        graph = new ArrayList<>();
        visited = new boolean[n+1];

        for(int i=0; i<=n; i++) {
            graph.add(new ArrayList<>());
        }


        for(int i=0; i<k; i++) {
            st=new StringTokenizer(br.readLine());
            int c1 = Integer.parseInt(st.nextToken());
            int c2 = Integer.parseInt(st.nextToken());
            graph.get(c1).add(c2);
            graph.get(c2).add(c1);
        }

        BFS(1);
        System.out.println(answer);
    }

    static void BFS(int s) {
        Queue<Integer> q = new LinkedList<>();

        visited[s]=true;
        q.offer(s);
        while(!q.isEmpty()) {

            for(int i=0; i<q.size(); i++) {
                int cur = q.poll();
                for(Integer next : graph.get(cur)) {
                    if(!visited[next]) {
                        answer++;
                        visited[next]=true;
                        q.offer(next);
                    }
                }
            }
        }

    }
}
