package String;


import java.util.Scanner;

public class 회문문자열 {

    public String solution(String str){
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) answer="YES";

        return answer;
    }

    public static void main(String[] args){
        회문문자열 T = new 회문문자열();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }

}
