package inflearn.bfsdfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 그래프최단거리BFS {

    static int n,m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch,dis;

    public void BFS(int v) {
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(v);
        ch[v]=1;
        dis[v]=0;

        while(!Q.isEmpty()) {
            int currentv =Q.poll();
            for(int nv : graph.get(currentv)) {
                if(ch[nv]==0) {
                    ch[nv]=1;
                    Q.offer(nv);
                    dis[nv]=dis[currentv]+1;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());

        graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<=n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        ch = new int[n+1];
        dis = new int[n+1];

        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
        }
        그래프최단거리BFS T = new 그래프최단거리BFS();

        T.BFS(1);

        for(int i=2; i<=n; i++) {
            System.out.println(i+" : "+dis[i]);
        }


    }
}
