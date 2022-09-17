package inflearn.TwoPointers;

import java.util.Scanner;

public class 최대매출 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }

        int max = Integer.MIN_VALUE;

//		for(int i=0; i<arr.length-k; i++) {
//			int temp=0;
//			for(int j=i; j<k+i; j++) {
//				temp += arr[j];
//			}
//			if(temp>max) {
//				max=temp;
//			}
//		}
        int sum=0;
        for(int i=0; i<k; i++) {
            sum += arr[i];
        }
        max=sum;

        for(int i=k; i<arr.length; i++) {
            sum=sum+arr[i]-arr[i-k];
            if(sum>max) max=sum;
        }
        System.out.println(max);
    }
}
