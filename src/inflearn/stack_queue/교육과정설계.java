package inflearn.stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 교육과정설계 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String condition = sc.next();
        String chart = sc.next();

        String answer = "YES";

        Queue<Character> queue = new LinkedList<>();

        for(char x : condition.toCharArray()) {
            queue.add(x);
        }

        for(char x : chart.toCharArray()) {
            if(queue.contains(x)) {
                if(x!=queue.poll()) {
                    answer ="NO";
                    break;
                }
            }
        }

        if(!queue.isEmpty()) answer = "NO";
        System.out.println(answer);
    }
}
