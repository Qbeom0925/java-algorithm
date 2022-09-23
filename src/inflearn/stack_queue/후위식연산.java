package inflearn.stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class 후위식연산 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Stack<Integer> stack = new Stack<>();

        char[] arr = s.toCharArray();
        for(int i = 0; i<arr.length; i++) {
            if(Character.isDigit(arr[i])) {
                stack.push(arr[i]-48);
            }else {
                int a = stack.pop();
                int b = stack.pop();
                switch(arr[i]) {
                    case '+':
                        stack.push(b+a);
                        break;
                    case '-': stack.push(b-a);
                        break;
                    case '*': stack.push(b*a);
                        break;
                    case '/': stack.push(a/b);
                        break;
                }


            }
        }
        System.out.println(stack.pop());

    }
}
