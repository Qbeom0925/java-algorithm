package inflearn.String;

import java.util.Scanner;

public class 짧은문자거리 {

    public int[] solution(String s, char t){
        int[] answer = new int[s.length()];

        int p = 1000;

        for (int i=0; i<s.length(); i++){
            if(s.charAt(i)==t){
                p=0;
                answer[i]=p;
            }else{
                p++;
                answer[i]=p;
            }
        }

        p=1000;

        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)==t) {
                p = 0;
            }else{
                p++;
                answer[i]=Math.min(answer[i],p);
            }
        }

        return answer;
    }

    public static void main(String[] args){
        짧은문자거리 T = new 짧은문자거리();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char t =sc.next().charAt(0);
        for(int x : T.solution(s,t)){
            System.out.print(x+" ");
        }
    }
}
