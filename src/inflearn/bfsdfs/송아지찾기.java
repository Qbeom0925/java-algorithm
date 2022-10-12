package inflearn.bfsdfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 송아지찾기 {
    static int[] dis = {1,-1,5};
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();
        int E = sc.nextInt();

        arr = new int[10001];
        arr[S] = 1;

        System.out.println(BFS(S,E));
    }

    static int BFS(int S, int E) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(S);
        int L =0;
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i=0; i<size; i++) {
                int cur = q.poll();
                for(int j=0; j<3; j++) {
                    int next = cur+dis[j];
                    if(next==E) return L+1;
                    if(next>1 && next<10000 && arr[next]==0) {
                        arr[next]=1;
                        q.offer(next);
                    }
                }
            }
            L++;
        }
        return -1;
    }
}
