package inflearn.Array;

import java.util.Scanner;

public class 임시반장정하기 {
    public int solution(int n, int[][] arr){
        int answer =0 , max= Integer.MIN_VALUE;


        for(int i=1; i<=n; i++) {
            int cnt = 0;
            for(int j=1; j<=n; j++) {
                for(int k=1; k<=5; k++) {
                    if(arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt>max) {
                max=cnt;
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        임시반장정하기 T = new 임시반장정하기();
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[][] arr1 = new int[n1+1][6];
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=n1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println(T.solution(n1,arr1));
    }
}
