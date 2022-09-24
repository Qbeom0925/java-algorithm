package inflearn.stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class 쇠막대기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Stack<Character> stack = new Stack<>();

        int answer = 0;
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i++) {
            if(arr[i]=='(') {
                stack.push(arr[i]);
            }
            else if(arr[i]==')') {
                char temp = stack.peek();
                stack.pop();
                if(arr[i-1]==')') {//연속 ))일 경우,
                    answer++;
                }else if(arr[i-1]=='('){// 레이저 발사~!
                    answer += stack.size();
                }
            }
        }
        System.out.println(answer);
    }
}
