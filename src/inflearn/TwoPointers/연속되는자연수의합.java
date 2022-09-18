package inflearn.TwoPointers;

import java.util.Scanner;

public class 연속되는자연수의합 {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int m = n/2+1;
            int[] arr = new int[m];
            int lt=0, rt=0, sum=0;
            int cnt=0;

            for(int i=0; i<m; i++) {
                arr[i]=i+1;
            }

            for(rt=0; rt<m; rt++) {
                sum+=arr[rt];

                if(sum==n) {
                    cnt++;
                }
                while(sum >= n) {
                    sum -= arr[lt];
                    lt++;
                    if(sum==n) cnt++;
                }
            }



            System.out.println(cnt);
        }
    }

