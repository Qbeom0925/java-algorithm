package inflearn.TwoPointers;

import java.util.Scanner;

public class 연속부분수열 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++)arr[i]=sc.nextInt();

        int cnt=0;

        int sum=0,lt=0;
        for(int rt=0; rt<n; rt++ ) {
            sum+=arr[rt];
            if(sum==m) {
                cnt++;
            }
            while(sum>=m) {
                sum-=arr[lt];
                lt++;
                if(sum==m) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
