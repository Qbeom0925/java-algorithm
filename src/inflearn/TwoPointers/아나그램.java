package inflearn.TwoPointers;

import java.util.HashMap;
import java.util.Scanner;

public class 아나그램 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String answer = "YES";

        String s1 = sc.next();
        String s2 = sc.next();

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char x : s1.toCharArray()) {
            map1.put(x, map1.getOrDefault(x,0)+1);
        }

        for(char x : s2.toCharArray()) {
            map2.put(x, map2.getOrDefault(x,0)+1);
        }

        if(!map1.equals(map2)) {
            answer="NO";
        }


        System.out.println(answer);
    }
}
