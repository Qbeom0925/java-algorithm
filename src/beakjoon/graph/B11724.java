package beakjoon.graph;

import java.util.*;
import java.io.*;

public class B11724 {

    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] visited;


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>();
        visited = new boolean[N+1];

        for(int i=0; i<=N; i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());
            graph.get(node1).add(node2);
            graph.get(node2).add(node1);
        }

        int cnt = 0;
        for(int i=1; i<=N; i++) {
            if(visited[i]==false) {
                cnt++;
                BFS(i);
            }
        }
        System.out.println(cnt);
    }


    private static void BFS(int s) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(s);
        visited[s]=true;

        while(!q.isEmpty()) {
            int size = q.size();
            for(int i=0; i<size; i++) {
                int cur = q.poll();
                for(int x : graph.get(cur)) {
                    if(visited[x]==false) {
                        visited[x]=true;
                        q.offer(x);
                    }
                }
            }
        }
    }
}