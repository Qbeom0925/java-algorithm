package inflearn.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 공통원소찾기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++) {
            arr1[i]=sc.nextInt();
        }

        int n2= sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0; i<n2; i++) {
            arr2[i]=sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        ArrayList<Integer> answer = new ArrayList<>();

        int p1=0,p2=0;

        while(p1<n&&p2<n2) {
            if(arr1[p1]==arr2[p2]) {
                answer.add(arr1[p1]);
                p1++;
                p2++;
            }else if(arr1[p1]<arr2[p2]){
                p1++;
            }else {
                p2++;
            }
        }

        for(int x:answer) {
            System.out.print(x+" ");
        }

    }
}
