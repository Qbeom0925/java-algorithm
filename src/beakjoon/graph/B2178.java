package beakjoon.graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B2178 {

    static int N, M;
    static int[][] map;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int[][] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new int[N][M];

        for(int i=0; i<N; i++) {
            String s = br.readLine();
            for(int j=0; j<M; j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }

        System.out.println(bfs(0,0));
    }

    static int bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        int L=0;
        q.offer(new int[] {x, y});
        visited[x][y]=1;
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i=0; i<size; i++) {
                //x,y기준으로 돌아야돼
                //좌표의 값이 1이면 넣어주고 0이면 넣지않음
                int[] arr = q.poll();

                for(int j=0; j<4; j++) {
                    if(arr[0]+dx[j]==N-1 && arr[1]+dy[j]==M-1) return L + 2;
                    if(outOfArea(arr[0]+dx[j],arr[1]+dy[j])) {
                        continue;
                    }else{
                        if(map[arr[0]+dx[j]][arr[1]+dy[j]]==1 && visited[arr[0]+dx[j]][arr[1]+dy[j]]==0) {
                            q.offer(new int[] {arr[0]+dx[j],arr[1]+dy[j]});
                            visited[arr[0]+dx[j]][arr[1]+dy[j]]=1;
                        }
                    }
                }
            }
            L++;
        }
        return L;
    }

    static boolean outOfArea(int x, int y) {
        if(x<0 || x>=N) {
            return true;
        }
        if(y<0 || y>=M) {
            return true;
        }
        return false;
    }
}

