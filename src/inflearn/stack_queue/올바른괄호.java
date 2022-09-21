package inflearn.stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class 올바른괄호 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String answer = "YES";

        Stack<Character> stack = new Stack<>();

        for(char x : s.toCharArray()) {
            if(x=='(') stack.push(x);
            else {
                if(stack.isEmpty()) {
                    answer="NO";
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()) answer="NO";

        System.out.println(answer);


    }
}
