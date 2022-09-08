package Array;

import java.util.Scanner;

public class 보이는학생 {
    public int solution(int n, int[] arr) {
        int answer = 1;
        int max = arr[0];
        for(int i=1; i<n; i++) {
            if(arr[i]>max) {
                answer++;
                max = arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        보이는학생 T = new 보이는학생();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] key = new int[n];
        for(int i=0; i<n; i++) {
            key[i] = sc.nextInt();
        }
        System.out.println(T.solution(n,key));
    }
}
