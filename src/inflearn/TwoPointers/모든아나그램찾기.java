package inflearn.TwoPointers;

import java.util.HashMap;
import java.util.Scanner;

public class 모든아나그램찾기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int answer = 0;

        String s = sc.next();
        String t = sc.next();

        HashMap<Character, Integer> map =new HashMap<>();

        for(char x : t.toCharArray()) {
            map.put(x,map.getOrDefault(x,0)+1);
        }

        char[] arr = s.toCharArray();

        int lt=0;

        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i=0; i<t.length()-1; i++) {
            map2.put(arr[i],map2.getOrDefault(arr[i],0)+1);
        }

        for(int rt = t.length()-1; rt<arr.length; rt++) {
            map2.put(arr[rt],map2.getOrDefault(arr[rt],0)+1);

            if(map.equals(map2)) {
                answer++;
            }

            //map2에서 이제 lt빼고
            map2.put(arr[lt],map2.getOrDefault(arr[lt],0)-1);

            //확인하고
            if(map2.get(arr[lt])==0) map2.remove(arr[lt]);

            lt++;

        }
        System.out.println(answer);
    }
}
