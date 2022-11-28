package beakjoon.graph;

import java.util.*;
import java.io.*;

public class B1697 {

    static boolean[] visited=new boolean[100001];
    static int[] move = {-1,1,2};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.println(BFS(N,K));
    }

    static int BFS(int s, int e) {
        Queue<Integer> q = new LinkedList<>();
        int L=0;
        visited[s]=true;
        q.offer(s);
        if(s==e) return L;
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i=0; i<size; i++) {
                int cur = q.poll();
                for(int j=0; j<3; j++) {
                    int nx=0;
                    if(j==2)nx=cur*move[j];
                    else nx=cur+move[j];
                    if(nx==e) return ++L;
                    if(checkIndex(nx)&&visited[nx]==false) {
                        visited[nx]=true;
                        q.offer(nx);
                    }
                }
            }
            L++;
        }

        return -1;
    }

    static boolean checkIndex(int cur){
        if(cur<0) return false;
        if(cur>100000)return false;
        return true;
    }
}