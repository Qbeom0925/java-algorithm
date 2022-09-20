package inflearn.TwoPointers;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class K번째로큰수 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr= new int[n];
        for(int i=0; i<n; i++) {
            arr[i] =sc.nextInt();
        }

        int answer=0;

        TreeSet<Integer> test = new TreeSet<>(Collections.reverseOrder());

        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                for(int l=j+1; l<n; l++) {
                    test.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        int cnt =0;

        test.remove(143);
        System.out.println(test.size());
        System.out.println(test.first());
        System.out.println(test.last());
        for(int x : test) {
            cnt++;
            if(cnt==3) {
                answer=x;
                break;
            }
//			System.out.println(x);
        }
        System.out.println(answer);
    }
}
