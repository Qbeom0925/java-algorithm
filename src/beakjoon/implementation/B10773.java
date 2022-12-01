package beakjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());


        Stack<Integer> stack = new Stack<>();

        for(int i = 1; i <= n; i++) {
            int insert = Integer.parseInt(br.readLine());
            if(insert == 0) {
                stack.pop();
            }else {
                stack.push(insert);
            }
        }

        int sum = 0;

        for(int x : stack) {
            sum += x;
        }

        System.out.println(sum);

    }

}
