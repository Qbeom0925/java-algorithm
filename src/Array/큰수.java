package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class 큰수 {

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i=1; i<n; i++) {
            if(arr[i]>=arr[i-1]) answer.add(arr[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        큰수 T = new 큰수();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] key = new int[n];
        for(int i=0; i<n; i++) {
            key[i] = sc.nextInt();
        }
        for(int x: T.solution(n,key)) {
            System.out.print(x + " ");
        }
    }
}
