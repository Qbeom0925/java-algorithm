package inflearn.section7;
import java.io.*;
import java.util.*;

public class 경로탐색 {

    static int n, m, answer = 0;
    static int[][] graph;
    static int[] visited;

    public static void DFS(int v) {
        if (v == 5){
            answer++;
            visited[5] = 0;
            return;
        }
        for (int i = 0; i <= n; i++){
            if (graph[v][i] == 1 && visited[i]==0){
                visited[i]=1;
                DFS(i);
                visited[i]=0;
            }
        }

    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new int[n+1][n+1];
        visited = new int[n+1];

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = 1;
        }

        visited[1] = 1;
        DFS(1);
        System.out.println(answer);
    }

}
