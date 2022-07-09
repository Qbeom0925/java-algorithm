package String;

import java.util.ArrayList;
import java.util.Scanner;

public class 단어뒤집기 {

//    public void solution(Scanner sc, String[] str){
//        for(int i=0; i<str.length; i++){
//            str[i]=sc.next();
//        }
//
//        for(String x:str){
//            StringBuffer sb = new StringBuffer(x);
//            System.out.println(sb.reverse().toString());
//        }
//    }
//
//    public static void main(String[] args){
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        int cnt = sc.nextInt();
//
//        String[] str = new String[cnt];
//        T.solution(sc, str);
//    }
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
//        for(String x:str){
//            String tmp = new StringBuilder(x).reverse().toString();
//            answer.add(tmp);
//        }
        for(String x:str){
            char[] s=x.toCharArray();
            int lt=0, rt=x.length()-1;
            while(lt<rt){
                char tmp = s[lt];
                s[lt]=s[rt];
                s[rt]=tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;

    }

    public static void main(String[] args){
        단어뒤집기 T = new 단어뒤집기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];

        for(int i=0; i<n; i++){
            str[i]=sc.next();
        }
        for(String x: T.solution(n,str)){
            System.out.println(x);
        }

    }
}
