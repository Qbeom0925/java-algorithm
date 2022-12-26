package beakjoon.implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class B11866 {
    public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());

    Queue<Integer> q = new LinkedList<>();

    for(int i = 1; i <= n; i++) {
        q.offer(i);
    }

    List<Integer> list = new ArrayList<>();

    while(!q.isEmpty()) {
        for(int i = 0; i < k - 1; i++) {
            q.offer(q.poll());
        }
        list.add(q.poll());
    }

    System.out.print("<");
    for(int i = 0; i < list.size()-1; i++) {
        System.out.print(list.get(i)+", ");
    }
    System.out.print(list.get(n-1)+">");
}
}
