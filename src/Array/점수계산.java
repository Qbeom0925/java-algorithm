package Array;

import java.util.Scanner;

public class 점수계산 {
    public int solution(int n, int[] arr){
        int answer = 0;
        int temp=0;

        for(int i=0; i<n; i++) {
            if(arr[i]==1) {
                temp++;
                answer += temp;
            }else {
                temp=0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        점수계산 T = new 점수계산();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print(T.solution(n,arr));
    }
}
