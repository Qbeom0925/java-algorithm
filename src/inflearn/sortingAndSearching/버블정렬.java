package inflearn.sortingAndSearching;

import java.util.Scanner;

public class 버블정렬 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }

        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(arr[i]>arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int x : arr) {
            System.out.print(x + " ");
        }
    }
}
