package String;

import java.util.Scanner;

public class 숫자만추출 {

    public int solution(String str){
        char[] chr = str.toCharArray();
        String tmp = "";
        for(char x : chr){
            if(x>=48 && x<=57) tmp += x;
        }


        return Integer.parseInt(tmp);

    }

    public static void main(String[] args){
        숫자만추출 T = new 숫자만추출();
        Scanner sc = new Scanner(System.in);
        String kb = sc.next();
        System.out.println(T.solution(kb));
    }
}
