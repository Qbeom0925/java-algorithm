package inflearn.stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class 괄호문자제거 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String answer = "";

        Stack<Character> stack = new Stack<>();

        stack.push('(');
        stack.push('(');

        stack.push(')');
        stack.push(')');
        stack.push(')');
        stack.push(')');


System.out.println(stack.search('('));
    }
}
