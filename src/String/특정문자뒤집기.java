package String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 특정문자뒤집기 {

    public String solution(String key){
        String answer = "";

        List<String> stringList = new ArrayList<>();
        char[] c = key.toCharArray();
        int lt=0, rt = key.length()-1;

        while(lt<rt){
            if(!Character.isAlphabetic(c[lt])) lt++;
            else if(!Character.isAlphabetic(c[rt])) rt--;
            else{
                char tmp = c[lt];
                c[lt]=c[rt];
                c[rt]=tmp;
                lt++;
                rt--;
            }

//            if(!(c[lt]>=65&&c[lt]<=90 || c[lt]>=97 && c[lt]<=122)){
//                lt++;
//            }else if(!(c[rt]>=65&&c[rt]<=90 || c[rt]>=97 && c[rt]<=122)){
//                rt--;
//            }else{
//                char tmp = c[lt];
//                c[lt]=c[rt];
//                c[rt] = tmp;
//                lt++;
//                rt--;
//            }
        }
        answer = String.valueOf(c);
        return answer;
    }

    public static void main(String[] args) {
        특정문자뒤집기 T = new 특정문자뒤집기();
        Scanner sc = new Scanner(System.in);
        String key = sc.next();
        System.out.println(T.solution(key));
    }
}
