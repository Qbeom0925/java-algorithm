package inflearn.sortingAndSearching;

import java.util.Scanner;

public class 선택정렬 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        int idx;
        for(int i=0; i<n; i++) {
            idx=i;
            for(int j=i+1; j<n; j++) {
                if(arr[j]<arr[idx]) {
                    idx=j;
                }

            }
            int temp = arr[i];
            arr[i]=arr[idx];
            arr[idx] = temp;
        }
        for(int x : arr) {
            System.out.print(x + " ");
        }
    }
}
