package inflearn.sortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class 중복확인{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            String answer = "U";

            int n = sc.nextInt();

            int[] arr = new int[n];

            for(int i=0; i<n; i++) {
                arr[i]=sc.nextInt();
            }

            Arrays.sort(arr);

            for(int i=1; i<n; i++) {
                if(arr[i]==arr[i-1])answer="D";
            }

            System.out.println(answer);
        }
}
