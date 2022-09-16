package inflearn.String;

import java.util.Scanner;

public class 팰린드롬 {

    public String solution(String str){
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) return "YES";

        return answer;
    }

    public static void main(String[] args){
        팰린드롬 T = new 팰린드롬();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
