package inflearn.TwoPointers;

import java.util.ArrayList;
import java.util.Scanner;

public class 두배열합치기 {
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

        ArrayList<Integer> answer = new ArrayList<>();


        int p1=0,p2=0;

        while(p1+p2!=n+n2) {
            if(p1<arr1.length && arr1[p1]<= arr2[p2] ) {
                answer.add(arr1[p1]);
                p1++;
            }else {
                answer.add(arr2[p2]);
                p2++;
            }
        }

        for(int x:answer) {
            System.out.print(x+" ");
        }

    }
}
