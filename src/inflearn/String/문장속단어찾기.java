package inflearn.String;

import java.util.Scanner;

public class 문장속단어찾기 {

//    public String solution(String str){
//        String[] arrStr = str.split(" ");
//        String answer = arrStr[0];
//        for (int i = 0; i < arrStr.length; i++) {
//            if(arrStr[i].length()>answer.length()){
//                answer=arrStr[i];
//            }
//        }
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        System.out.println(T.solution(input));
//    }

    public String solution(String str){
        String answer = "";
        int m = Integer.MIN_VALUE, pos;
        while ((pos = str.indexOf(' ')) != -1){
            String tmp = str.substring(0,pos);
            int len = tmp.length();
            if(len>m) {
                m=len;
                answer =tmp;
            }
            str = str.substring(pos+1);
        }
        if(str.length() >m) answer =str;

//        String[] s = str.split(" ");
//        for(String x : s){
//            int len = x.length();
//            if(len >m){
//                m = len;
//                answer = x;
//            }
//        }

        return answer;
    }

    public static void main(String[] args){
        문장속단어찾기 T = new 문장속단어찾기();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(T.solution(input));
    }
}
