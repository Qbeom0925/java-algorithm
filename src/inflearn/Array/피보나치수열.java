package inflearn.Array;

import java.util.Scanner;

public class 피보나치수열 {

    public int[] solution(int n){
        int[] arr = new int[n];
        arr[0]=1;
        arr[1]=1;

        int temp=0;
        for(int i=2; i<n; i++) {
            temp = arr[i-2];
            arr[i] = arr[i-1]+temp;
            temp=0;
        }
        return arr;
    }

    public static void main(String[] args) {
        피보나치수열 T = new 피보나치수열();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int x:T.solution(n))
            System.out.print(x+" ");
    }
}
