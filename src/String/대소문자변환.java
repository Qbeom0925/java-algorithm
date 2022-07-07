package String;

import java.util.Scanner;

public class 대소문자변환 {

    public String solution(String str){
        String answer = "";

        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);

        }
        return answer;
    }

    public static void main(String[] args) {
        대소문자변환 t = new 대소문자변환();
        Scanner in=new Scanner(System.in);
        String input = in.next();
        System.out.println(t.solution(input));
    }
}
