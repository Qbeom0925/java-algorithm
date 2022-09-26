package inflearn.stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 공주구하기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<=n; i++) {
            queue.add(i);
        }
        int i=0;
        int cnt = 0;

        while(queue.size()>1) {
            cnt++;
            if(cnt==k) {
                queue.remove();
                cnt=0;
            }else {
                int temp = queue.remove();
                queue.add(temp);
            }
        }

        System.out.println(queue.peek());
    }
}
