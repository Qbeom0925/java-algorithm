package String;

import java.util.Scanner;

public class 암호 {

    public String solution(int n, String s) {
        String answer="";

        for(int i=0; i<n; i++){
            String tmp = s.substring(0,7).replace('#','1').replace('*','0');
            int num=Integer.parseInt(tmp,2);
            answer += (char)num;
            s=s.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        암호 T = new 암호();
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String s = sc.next();
        System.out.println(T.solution(i,s));
    }
}
