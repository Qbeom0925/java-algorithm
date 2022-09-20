package inflearn.TwoPointers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class 매출액종류{

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            ArrayList<Integer> answer = new ArrayList();

            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n; i++) {
                arr[i]=sc.nextInt();
            }

            HashMap<Integer, Integer> map = new HashMap<>();

            int lt=0;

            for(int i=0; i<k; i++) {
                map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            }

            for(int rt=k-1; rt<n; rt++) {
                map.put(arr[rt], map.getOrDefault(arr[rt],0)+1);
                answer.add(map.size());

                map.put(arr[lt],map.get(arr[lt])-1);
                if(map.get(arr[lt])==0) {
                    map.remove(arr[lt]);
                }
                lt++;
            }

            for(int x : answer) {
                System.out.print(x+" ");
            }
        }
}
